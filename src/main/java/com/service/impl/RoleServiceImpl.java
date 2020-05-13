package com.service.impl;

import com.dao.PermisionDao;
import com.dao.RoleDao;
import com.dao.RoleDescriptionDao;
import com.exception.CustomizedException;
import com.service.RoleService;
import com.utils.PaperPage;
import com.utils.Permision;
import com.utils.Role;
import com.utils.Roledescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PermisionDao permisionDao;

    @Autowired
    private RoleDescriptionDao roleDescriptionDao;

    @Override
    public Map<String, Object> getRoleByPage(PaperPage paperPage) {
        if(paperPage.getRoleName().equals("")) {
            paperPage.setRoleName(null);
        }
        int pageSize = paperPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (paperPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            //beginPage = 0;
            throw new CustomizedException("页码不符合规范");
        }
        paperPage.setBeginPage(beginPage);
        List<Role> roleList = roleDao.getRoleByPage(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", roleList);
        return map;
    }

    @Override
    public int getRoleCount(PaperPage paperPage){
        if(paperPage.getRoleName().equals("")) {
            paperPage.setRoleName(null);
        }
        return roleDao.getRoleCount(paperPage);
    }

    @Override
    public Map<String, Object> getAllPermission(){
        List<Permision> permissionList = permisionDao.getAllPermission();
        Map<String, Object> map = new HashMap<>();
        map.put("data", permissionList);
        return map;
    }

    /**
     * 添加角色并分配权限
     * @param role
     * @return
     */
    @Override
    public int addRole(Role role) {
        //生成角色
        roleDao.addRole(role);

        //获取刚生成角色id
        Roledescription roledescription = new Roledescription();
        roledescription.setRoleId(roleDao.getMaxRoleId());

        //获取权限列表
        List<String> list = role.getPermissionList();
        /**
         * 生成角色权限
         */
        for(int i=0; i<list.size(); i++){
            roledescription.setRightId(Integer.parseInt(list.get(i)));
            roleDescriptionDao.addRoleDescription(roledescription);
        }
        return 0;
    }

    @Override
    public Map<String, Object> getOwnPermissionByRoleId(Role role){
        List<Permision> permissionList = permisionDao.getOwnPermissionByRoleId(role);
        Map<String, Object> map = new HashMap<>();
        map.put("data", permissionList);
        return map;
    }
}
