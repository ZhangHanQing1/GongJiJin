package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.aaa.entity.Dwzh;
import com.aaa.entity.TongYong;

public interface DwzhMapper {
    int deleteByPrimaryKey(Integer dwbh);

    int insert(Dwzh record);
//��λ��Ϣ���
    int insertSelective(Dwzh record);

    Dwzh selectByPrimaryKey(Integer dwbh);

    int updateByPrimaryKeySelective(Dwzh record);

    int updateByPrimaryKey(Dwzh record);
 //��λ��Ϣ��ѯ  
    List<Map> select();
 //����ID��ѯ��λ��Ϣ
    List<Map> selectId(String dwmc2);
  //��λ�����޸�
    void  BiLiUp(TongYong tongYong); 
    void  BiLiUpAnd(TongYong tongYong);
//  ���˻����޸�ǰ��ѯ  selectGR
    public List<Map>selectGR(String dwmc2);
//   ���˻����޸Ĳ�����
    void JiShuUp(TongYong tongYong);
    void JiShuAdd(TongYong tongYong);
    //���˻��������¼
    public List<Map> selectJiShu();
    
    List<Map<String,Object>> findAllDwzh();
}