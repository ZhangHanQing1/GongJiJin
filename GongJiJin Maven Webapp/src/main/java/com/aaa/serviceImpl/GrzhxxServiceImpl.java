package com.aaa.serviceImpl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.GrzhxxMapper;
import com.aaa.service.GrzhxxService;
@Service
public class GrzhxxServiceImpl implements GrzhxxService {
    @Autowired
    private GrzhxxMapper grzhxxMapper;
	@Override
	public int insertGrzhxx(Map<String,Object> map) {
		map.put("grzhzt","正常");
		map.put("khrq", new Date());
		map.put("grzhye",0);
		return grzhxxMapper.insertSelective(map);
	}
	@Transactional
	@Override
	public int insertMany(String[][] data) {
		int i=1;
			for (String[] strings : data) {
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("dwbh",strings[0]);
				map.put("xingming",strings[1]);
				map.put("xmqp",strings[2]);
				map.put("xingbie",strings[3]);
				map.put("zjlxbh",strings[4]);
				map.put("sbzh",strings[5]);
				map.put("gddhhm2",strings[6]);
				map.put("sjhm2",strings[7]);
				map.put("csny",strings[8]);
				map.put("hyzk",strings[9]);
				map.put("zhiye",strings[10]);
				map.put("yzbm",strings[11]);
				map.put("xueli",strings[12]);
				map.put("jtzz",strings[13]);
				map.put("yhcxzh",strings[14]);
				map.put("grjcjs3",strings[15]);
				/*默认值设置*/
				map.put("grzhzt","正常");
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				map.put("khrq", dateFormat.format(new Date(System.currentTimeMillis())));
				map.put("grzhye",0);
				i=i*grzhxxMapper.insertSelective(map);
			}
		return i;
	}
	@Override
	public Map<String, Object> selectById(Integer grbh) {
		Map<String, Object> map=grzhxxMapper.selectById(grbh);
		int i=(int) map.get("grjcbl");
		BigDecimal num1=new BigDecimal(i);
		BigDecimal num2=(BigDecimal) map.get("grjcjs3");
		BigDecimal num3=new BigDecimal(100);
		BigDecimal num4=num1.multiply(num2).divide(num3);
		map.put("grje", num4);
		return map;
	}
	@Override
	public List<Map<String, Object>> findByConditions(Map<String, Object> map) {
		if(map.get("grbh")==null||map.get("grbh")==""||map.get("grbh").equals("")){
			map.remove("grbh");
		}
		return grzhxxMapper.findByConditions(map);
	}
	@Override
	public List<Map<String, Object>> findById(Integer grbh) {
		Map<String, Object> map=grzhxxMapper.findById(grbh);
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("grbh", grbh);
		params.put("sbzh", map.get("sbzh"));
		List<Map<String, Object>> list=grzhxxMapper.findBySbzh(params);
		list.add(0, map);
		return list;
	}
	@Override
	public Map<String, Object> selectByGrbh(Integer grbh) {
		return grzhxxMapper.selectByGrbh(grbh);
	}
}