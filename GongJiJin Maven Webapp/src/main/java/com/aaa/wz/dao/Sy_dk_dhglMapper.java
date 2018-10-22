package com.aaa.wz.dao;

import com.aaa.entity.Sy_dk_dhgl;

public interface Sy_dk_dhglMapper {
    int deleteByPrimaryKey(Integer dhglzj);

    int insert(Sy_dk_dhgl record);

    int insertSelective(Sy_dk_dhgl record);

    Sy_dk_dhgl selectByPrimaryKey(Integer dhglzj);

    int updateByPrimaryKeySelective(Sy_dk_dhgl record);

    int updateByPrimaryKey(Sy_dk_dhgl record);
}