package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.role;
/**
*  @author author
*/
public interface roleBaseMapper {

    int insertrole(role object);

    int updaterole(role object);

    int update(role.UpdateBuilder object);

    List<role> queryrole(role object);

    role queryroleLimit1(role object);

}