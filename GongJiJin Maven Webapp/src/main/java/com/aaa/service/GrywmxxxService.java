package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Grywmxxx;

public interface GrywmxxxService {

    /*���˽ɴ棬�����¼*/
    public int insertSelective(Map<String, Object> map);
    /*��ѯ���˽ɴ��¼*/
    public List<Grywmxxx> selectById(int grbh);
}
