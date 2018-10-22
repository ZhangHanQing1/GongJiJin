package com.aaa.wz.service;

import com.aaa.entity.Jsxmdkjkhtxx;

public interface JsxmdkjkhtxxService {

	    int deleteByPrimaryKey(Integer zj);

	    int insert(Jsxmdkjkhtxx record);

	    int insertSelective(Jsxmdkjkhtxx record);

	    Jsxmdkjkhtxx selectByPrimaryKey(Integer zj);

	    int updateByPrimaryKeySelective(Jsxmdkjkhtxx record);

	    int updateByPrimaryKey(Jsxmdkjkhtxx record);
}
