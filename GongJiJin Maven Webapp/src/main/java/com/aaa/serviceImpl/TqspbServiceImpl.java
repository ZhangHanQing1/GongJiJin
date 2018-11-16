package com.aaa.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Sy_gj_tqspbMapper;
import com.aaa.entity.Sy_gj_tqspb;
import com.aaa.service.TqspbService;
@Service
public class TqspbServiceImpl implements TqspbService {
    @Autowired
	private Sy_gj_tqspbMapper mapper;
	@Override
	public int insertSelective(Map<String, Object> map) {
		map.put("spzt2", "未审核");
		return mapper.insertSelective(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Integer id) {
		Sy_gj_tqspb tqsp1=new Sy_gj_tqspb();
		tqsp1.setTqbh(id);
		tqsp1.setSpzt2("已通过");
		return mapper.updateByPrimaryKeySelective(tqsp1);
	}

	@Override
	public List<Map<String, Object>> selectTqspb() {
		return mapper.selectTqspb();
	}

}
