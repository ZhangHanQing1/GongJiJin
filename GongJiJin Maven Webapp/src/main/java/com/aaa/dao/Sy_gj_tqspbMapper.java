package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Sy_gj_tqspb;

public interface Sy_gj_tqspbMapper {
    int deleteByPrimaryKey(Integer tqbh);

    int insert(Sy_gj_tqspb record);
    /*增加一条提取申请*/
    int insertSelective(Map<String, Object> map);

    Sy_gj_tqspb selectByPrimaryKey(Integer tqbh);
    /*修改提取记录*/
    int updateByPrimaryKeySelective(Sy_gj_tqspb record);

    int updateByPrimaryKey(Sy_gj_tqspb record);
    /*查询公积金提取申请*/
    public List<Map<String, Object>> selectTqspb();
}