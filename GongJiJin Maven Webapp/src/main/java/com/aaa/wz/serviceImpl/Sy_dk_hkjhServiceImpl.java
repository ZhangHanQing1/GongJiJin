package com.aaa.wz.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Sy_dk_hkjhMapper;
import com.aaa.entity.Sy_dk_hkjh;
import com.aaa.wz.service.Sy_dk_hkjhService;

@Service
public class Sy_dk_hkjhServiceImpl implements Sy_dk_hkjhService{
	 
        @Autowired
	   private Sy_dk_hkjhMapper dao;

		@Override
		public int add(Sy_dk_hkjh hkjh) {
			// TODO Auto-generated method stub
			return dao.insertSelective(hkjh);
		}

		@Override
		public Sy_dk_hkjh hkjhId(int hkjhzj) {
			// TODO Auto-generated method stub
			return dao.selectByPrimaryKey(hkjhzj);
		}

		@Override
		public List<Map<String, Object>> hkjkAll() {
			// TODO Auto-generated method stub
			return dao.hkjkAll();
		}

		@Override
		public void update(Sy_dk_hkjh hkjh) {
			// TODO Auto-generated method stub
			
			dao.updateByPrimaryKeySelective(hkjh);
		}

		@Override
		public Map hkjhIdd(int ydtqspzj) {
			// TODO Auto-generated method stub
			return dao.hkjhIdd(ydtqspzj);
		}

		

}
