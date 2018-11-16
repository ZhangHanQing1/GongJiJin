package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.aaa.entity.Dwzh;
import com.aaa.entity.TongYong;

public interface DwzhMapper {
    int deleteByPrimaryKey(Integer dwbh);

    int insert(Dwzh record);
//单位信息添加
    int insertSelective(Dwzh record);

    Dwzh selectByPrimaryKey(Integer dwbh);

    int updateByPrimaryKeySelective(Dwzh record);

    int updateByPrimaryKey(Dwzh record);
 //单位信息查询  
    List<Map> select();
 //根据ID查询单位信息
    List<Map> selectId(String dwmc2);
  //单位比例修改
    void  BiLiUp(TongYong tongYong); 
    void  BiLiUpAnd(TongYong tongYong);
//  个人基数修改前查询  selectGR
    public List<Map>selectGR(String dwmc2);
//   个人基数修改并保存
    void JiShuUp(TongYong tongYong);
    void JiShuAdd(TongYong tongYong);
    //个人基数变更记录
    public List<Map> selectJiShu();
    
    List<Map<String,Object>> findAllDwzh();
}