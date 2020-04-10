package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.dictionary;
/**
*  @author author
*/
public interface dictionaryBaseMapper {

    int insertdictionary(dictionary object);

    int updatedictionary(dictionary object);

    int update(dictionary.UpdateBuilder object);

    List<dictionary> querydictionary(dictionary object);

    dictionary querydictionaryLimit1(dictionary object);

}