package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Grywmxxx;

public interface GrywmxxxMapper {
    int deleteByPrimaryKey(Integer grywmxbh);

    int insert(Grywmxxx record);
    /*ä¸ªäººç¼´è´¹*/
    int insertByMap(Map<String, Object> map);

    Grywmxxx selectByPrimaryKey(Integer grywmxbh);

    int updateByPrimaryKeySelective(Grywmxxx record);

    int updateByPrimaryKey(Grywmxxx record);
    /* æŸ¥è¯¢ä¸ªäººç¼´è´¹å†å²è®°å½•*/
    List<Grywmxxx> selectById(int grbh);
    //¸öÈËÃ÷Ï¸Ìí¼Ó
    int insertSelective(Grywmxxx record);

    
}