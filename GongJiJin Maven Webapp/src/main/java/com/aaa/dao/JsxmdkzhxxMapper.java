package com.aaa.dao;

import com.aaa.entity.Jsxmdkzhxx;

public interface JsxmdkzhxxMapper {
    int deleteByPrimaryKey(Integer dkzhbh);

    int insert(Jsxmdkzhxx record);

    int insertSelective(Jsxmdkzhxx record);

    Jsxmdkzhxx selectByPrimaryKey(Integer dkzhbh);

    int updateByPrimaryKeySelective(Jsxmdkzhxx record);

    int updateByPrimaryKey(Jsxmdkzhxx record);
}