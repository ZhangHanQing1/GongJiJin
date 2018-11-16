package com.aaa.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.GrzhxxMapper;
import com.aaa.dao.Sy_gj_tqspbMapper;
import com.aaa.entity.Grzhxx;
import com.aaa.entity.Sy_gj_tqspb;
import com.aaa.service.TqspbService;
@Service
public class TqspbServiceImpl implements TqspbService {
    @Autowired
	private Sy_gj_tqspbMapper mapper;
    @Autowired
	private GrzhxxMapper grzhxxMapper;
	@Override
	public int insertSelective(Map<String, Object> map) {
		map.put("spzt2", "未审核");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		map.put("sqsj", dateFormat.format(new Date(System.currentTimeMillis())));
		return mapper.insertSelective(map);
	}
    @Transactional
	@Override
	public int updateByPrimaryKeySelective(Integer tqbh) {
		Sy_gj_tqspb tqsp1=mapper.selectByPrimaryKey(tqbh);/*鑾峰彇鍒板叕绉噾鎻愬彇鐢宠璁板綍*/
		Grzhxx grzhxx=grzhxxMapper.selectByPrimaryKey(tqsp1.getGrbh());/*鑾峰彇鍒颁釜浜鸿处鎴蜂俊鎭�*/
		grzhxx.setGrzhye(grzhxx.getGrzhye().subtract(tqsp1.getTqze()));
		grzhxxMapper.updateByPrimaryKeySelective(grzhxx);/*淇敼涓汉璐︽埛浣欓*/
		tqsp1.setSpzt2("已通过");
		int i=mapper.updateByPrimaryKeySelective(tqsp1);/*淇敼鍏Н閲戞彁鍙栫敵璇峰鎵圭姸鎬�*/
		return i;
	}

	@Override
	public List<Map<String, Object>> selectTqspb() {
		return mapper.selectTqspb();
	}

}
