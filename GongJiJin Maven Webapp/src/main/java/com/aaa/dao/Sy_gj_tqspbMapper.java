package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Sy_gj_tqspb;

public interface Sy_gj_tqspbMapper {
    int deleteByPrimaryKey(Integer tqbh);

    int insert(Sy_gj_tqspb record);

    int insertSelective(Sy_gj_tqspb record);

    Sy_gj_tqspb selectByPrimaryKey(Integer tqbh);

    int updateByPrimaryKeySelective(Sy_gj_tqspb record);

    int updateByPrimaryKey(Sy_gj_tqspb record);
    
 
    
}