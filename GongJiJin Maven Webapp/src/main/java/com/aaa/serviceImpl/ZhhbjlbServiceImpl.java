package com.aaa.serviceImpl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.GrzhxxMapper;
import com.aaa.dao.ZhhbjlbMapper;
import com.aaa.entity.Grzhxx;
import com.aaa.entity.Zhhbjlb;
import com.aaa.service.ZhhbjlbService;
@Service
public class ZhhbjlbServiceImpl implements ZhhbjlbService {
    @Autowired
    private ZhhbjlbMapper mapper;
    @Autowired
    private GrzhxxMapper grzhxxMapper;
	@Override
	public int insertZhhbjlb(Map<String, Object> map) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		map.put("cjsj", dateFormat.format(new Date(System.currentTimeMillis())));
		map.put("tzzd1", "未审核");
		Grzhxx oldGrzhxx=grzhxxMapper.selectByPrimaryKey((Integer) map.get("xhgrzh"));
		map.put("xhgrzhye", oldGrzhxx.getGrzhye());
		mapper.insertzhhbjlb(map);
		return 1;
	}
	@Transactional
	@Override
	public int confirmZhhbjlb(Integer jlbh) {
		Zhhbjlb zhhbjlb=mapper.selectByPrimaryKey(jlbh);//鑾峰彇鍒拌处鎴峰悎骞惰褰�
		Grzhxx newGrzhxx=grzhxxMapper.selectByPrimaryKey(zhhbjlb.getBlgrzh());//鑾峰彇鍒颁繚鐣欒处鎴�
		Grzhxx oldGrzhxx=grzhxxMapper.selectByPrimaryKey(zhhbjlb.getXhgrzh());//鑾峰彇鍒伴攢鎴疯处鎴�
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("grbh", newGrzhxx.getGrbh());
		map.put("grzhye", newGrzhxx.getGrzhye().add(oldGrzhxx.getGrzhye()));
		grzhxxMapper.changeGrzhye(map);//涓轰繚鐣欒处鎴疯繘琛屼綑棰濈殑澧炲姞
		Map<String, Object> map2=new HashMap<String, Object>();
		BigDecimal zero=new BigDecimal(0);
		map2.put("grbh", oldGrzhxx.getGrbh());
		map2.put("grzhye", zero);
		grzhxxMapper.changeGrzhye(map2);//涓洪攢鎴疯处鎴疯繘琛屼綑棰濈殑娓呴浂
		grzhxxMapper.fengcun(oldGrzhxx.getGrbh());//灏佸瓨閿�鎴疯处鎴�
		//璐︽埛鍚堝苟鐢宠瀹℃壒鐘舵�佷慨鏀�
		Zhhbjlb zhhb1=new Zhhbjlb();
		zhhb1.setJlbh(jlbh);
		zhhb1.setTzzd1("已通过");
		mapper.updateByPrimaryKeySelective(zhhb1);
		return 1;
	}
	@Override
	public List<Map<String, Object>> findByConditions(Map<String, Object> map) {
		return mapper.findByConditions(map);
	}
}
