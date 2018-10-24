package com.aaa.dao;

import com.aaa.entity.Jsxmdkdywxx;

public interface JsxmdkdywxxMapper {
    int deleteByPrimaryKey(Integer dywzj);

    int insert(Jsxmdkdywxx record);

    int insertSelective(Jsxmdkdywxx record);

    Jsxmdkdywxx selectByPrimaryKey(Integer dywzj);

    int updateByPrimaryKeySelective(Jsxmdkdywxx record);

    int updateByPrimaryKey(Jsxmdkdywxx record);
}