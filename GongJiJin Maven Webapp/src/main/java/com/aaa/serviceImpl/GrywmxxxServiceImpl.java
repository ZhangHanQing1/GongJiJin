package com.aaa.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.GrywmxxxMapper;
import com.aaa.entity.Grywmxxx;
import com.aaa.service.GrywmxxxService;
@Service
public class GrywmxxxServiceImpl implements GrywmxxxService {
    @Autowired
    private GrywmxxxMapper mapper;
	@Override
	public int insertSelective(Map<String, Object> map) {
		return mapper.insertByMap(map);
	}
	@Override
	public List<Grywmxxx> selectById(int grbh) {
		List<Grywmxxx> list=mapper.selectById(grbh);
		return list;
	}

}
