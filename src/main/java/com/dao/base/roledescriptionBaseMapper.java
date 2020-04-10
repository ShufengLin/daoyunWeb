package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.roledescription;
/**
*  @author author
*/
public interface roledescriptionBaseMapper {

    int insertroledescription(roledescription object);

    int updateroledescription(roledescription object);

    int update(roledescription.UpdateBuilder object);

    List<roledescription> queryroledescription(roledescription object);

    roledescription queryroledescriptionLimit1(roledescription object);

}