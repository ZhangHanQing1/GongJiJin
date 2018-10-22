package com.aaa.wz.dao;

import com.aaa.entity.Jsxmxx;

public interface JsxmxxMapper {
    int deleteByPrimaryKey(Integer jsxmzj);

    int insert(Jsxmxx record);

    int insertSelective(Jsxmxx record);

    Jsxmxx selectByPrimaryKey(Integer jsxmzj);

    int updateByPrimaryKeySelective(Jsxmxx record);

    int updateByPrimaryKey(Jsxmxx record);
}