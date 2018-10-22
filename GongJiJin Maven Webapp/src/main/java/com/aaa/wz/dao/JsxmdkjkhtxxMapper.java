package com.aaa.wz.dao;

import com.aaa.wz.entity.Jsxmdkjkhtxx;

public interface JsxmdkjkhtxxMapper {
	
    int deleteByPrimaryKey(Integer zj);

    int insert(Jsxmdkjkhtxx record);

    int insertSelective(Jsxmdkjkhtxx record);

    Jsxmdkjkhtxx selectByPrimaryKey(Integer zj);

    int updateByPrimaryKeySelective(Jsxmdkjkhtxx record);

    int updateByPrimaryKey(Jsxmdkjkhtxx record);
    
}