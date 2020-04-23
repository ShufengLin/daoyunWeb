package com.service;

import com.utils.Dic;
import com.utils.dictionary;

import java.util.List;

public interface DicService {

    int insertdictionary(dictionary object);

    int updatedictionary(dictionary object);

    int update(dictionary.UpdateBuilder object);

    List<dictionary> querydictionary(dictionary object);

    dictionary querydictionaryLimit1(dictionary object);

}
