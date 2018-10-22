package com.aaa.wz.dao;

import com.aaa.entity.Jsxmdkyqdjxx;

public interface JsxmdkyqdjxxMapper {
    int deleteByPrimaryKey(Integer xmzj);

    int insert(Jsxmdkyqdjxx record);

    int insertSelective(Jsxmdkyqdjxx record);

    Jsxmdkyqdjxx selectByPrimaryKey(Integer xmzj);

    int updateByPrimaryKeySelective(Jsxmdkyqdjxx record);

    int updateByPrimaryKey(Jsxmdkyqdjxx record);
}