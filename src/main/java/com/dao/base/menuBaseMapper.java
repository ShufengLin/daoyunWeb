package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.menu;
/**
*  @author author
*/
public interface menuBaseMapper {

    int insertmenu(menu object);

    int updatemenu(menu object);

    int update(menu.UpdateBuilder object);

    List<menu> querymenu(menu object);

    menu querymenuLimit1(menu object);

}