package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.permision;
/**
*  @author author
*/
public interface permisionBaseMapper {

    int insertpermision(permision object);

    int updatepermision(permision object);

    int update(permision.UpdateBuilder object);

    List<permision> querypermision(permision object);

    permision querypermisionLimit1(permision object);

}