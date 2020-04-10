package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.dictionarydetail;
/**
*  @author author
*/
public interface dictionarydetailBaseMapper {

    int insertdictionarydetail(dictionarydetail object);

    int updatedictionarydetail(dictionarydetail object);

    int update(dictionarydetail.UpdateBuilder object);

    List<dictionarydetail> querydictionarydetail(dictionarydetail object);

    dictionarydetail querydictionarydetailLimit1(dictionarydetail object);

}