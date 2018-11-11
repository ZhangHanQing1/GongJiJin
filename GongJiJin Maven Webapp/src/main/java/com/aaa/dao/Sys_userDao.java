package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


import com.aaa.entity.Sys_menu;
import com.aaa.entity.Sys_role;
import com.aaa.entity.Sys_role_menu;
import com.aaa.entity.Sys_user;
import com.aaa.entity.Sys_user_post;
import com.aaa.entity.Sys_user_role;

public interface Sys_userDao {
	public Sys_user ussel(Sys_user s);
	public List<Sys_menu> mesel(Sys_user_role sur);
	public List<Map<String, Object>> showUser(@Param("user_name") String user_name);
	//��ѯ���ű�
	public List<Map<String, Object>> showDept();
	//��ѯ��λ��
	public List<Map<String, Object>> showPost();
	//��ѯ��λ��
	public List<Map<String, Object>> showRole();
	//����û���
	public boolean addUser(Sys_user su);
	//��ѯ��½���Ƿ�һ��
	public Sys_user selUser(Sys_user su);
	//����û���λ������
	public boolean addSup(Sys_user_post sup);
	//����û���ɫ������
	public boolean addSur(Sys_user_role sur);
	//�޸��û���
	public boolean updateUser(Sys_user su);
	//�޸��û���
	public boolean updateUser1(Sys_user su);
	//�޸��û���
	public boolean updateUser2(Sys_user su);
	//��ѯȨ�ޱ�
	public List<Map<String, Object>> showMenu(@Param("menu_name") String menu_name);
	//��ѯȨ�ޱ�
	public List<Map<String, Object>> showMenu2(@Param("url") String url);
	//���Ȩ�ޱ�
	public boolean addMenu(Sys_menu me);
	//ͨ��id��ѯȨ�ޱ�
	public Sys_menu showMenu1(Sys_menu sm);
	//�޸�Ȩ�ޱ�
	public boolean updateMenu(Sys_menu me);
	//�޸�Ȩ�ޱ�
	public boolean updateMenu5(Sys_menu me);
	//ɾ��Ȩ�ޱ�
	public boolean deleteMenu(Sys_menu me);
	//��ӽ�ɫ��
	public boolean addRole(Sys_role ro);
	//ͣ�ý�ɫ
	public boolean updateRole(Sys_role ro);
	//���ý�ɫ
	public boolean updateRole1(Sys_role ro);
	//�޸Ľ�ɫ
	public boolean updateRole2(Sys_role ro);
	//ɾ����ɫ
	public boolean deleteRole(Sys_role ro);
	//ͨ��id��ѯ��ɫ��
	public Sys_role shoeRoleId(Sys_role ro);
	public List<Map<String, Object>> showMenuShu(int role_id);
	public List<Map<String, Object>> selectMeRo();
	public int deleteSRM(int role_id);
	public int addSRM(Sys_role_menu srm);
	public List<Map<String, Object>> showMenu22();
}
