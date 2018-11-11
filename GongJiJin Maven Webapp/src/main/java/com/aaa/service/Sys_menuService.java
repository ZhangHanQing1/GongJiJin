package com.aaa.service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Message;
import com.aaa.entity.Sys_menu;
import com.aaa.entity.Sys_role;
import com.aaa.entity.Sys_role_menu;
import com.aaa.entity.Sys_user;
import com.aaa.entity.Sys_user_post;
import com.aaa.entity.Sys_user_role;

public interface Sys_menuService {
	public List<Sys_menu> smrsel(Sys_user s,Sys_user_role sur);
	
	public List<Map<String, Object>> showUser(String user_name);
	//��ѯ���ű�
	public List<Map<String, Object>> showDept();
	//��ѯ��λ��
	public List<Map<String, Object>> showPost();
	//��ѯ��ɫ��
	public List<Map<String, Object>> showRole();
	//
	public boolean addZong(Sys_user su,Sys_user_role sur,Sys_user_post sup);
	//�޸��û���
	public boolean updateUser(Sys_user su);
	//�޸��û���
	public boolean updateUser2(Sys_user su);
	//��ѯȨ�ޱ�
	public List<Map<String, Object>> showMenu(String menu_name,String url);
	//���Ȩ�ޱ�
	public boolean addMenu(Sys_menu me);
	//ͨ��id��ѯȨ�ޱ�
	public Sys_menu showMenu1(Sys_menu sm);
	//�޸�Ȩ�ޱ�
	public boolean updateMenu(Sys_menu me);
	//ɾ��Ȩ�ޱ�
	public boolean deleteMenu(Sys_menu me);
	//��ӽ�ɫ��
	public boolean addRole(Sys_role ro);
	//���ú�ͣ�ý�ɫ
	public boolean updateRole(Sys_role ro);
	//�޸Ľ�ɫ
	public boolean updateRole2(Sys_role ro);
	//ɾ����ɫ
	public boolean deleteRole(Sys_role ro);
	//ͨ��id��ѯ��ɫ��
	public Sys_role shoeRoleId(Sys_role ro);
	public List<Map<String, Object>> showMenuShu(int role_id);
	public List<Map<String, Object>> selectMeRo();
	public void deleteSRM(int role_id,Message srm);
	public List<Map<String, Object>> showMenu22();
}
