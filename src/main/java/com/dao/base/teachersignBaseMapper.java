package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.teachersign;
/**
*  @author author
*/
public interface teachersignBaseMapper {

    int insertteachersign(teachersign object);

    int updateteachersign(teachersign object);

    int update(teachersign.UpdateBuilder object);

    List<teachersign> queryteachersign(teachersign object);

    teachersign queryteachersignLimit1(teachersign object);

}