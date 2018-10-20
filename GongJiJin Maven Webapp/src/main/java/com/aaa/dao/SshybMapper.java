package com.aaa.dao;

import com.aaa.entity.Sshyb;

public interface SshybMapper {
    int deleteByPrimaryKey(Integer hybh);

    int insert(Sshyb record);

    int insertSelective(Sshyb record);

    Sshyb selectByPrimaryKey(Integer hybh);

    int updateByPrimaryKeySelective(Sshyb record);

    int updateByPrimaryKey(Sshyb record);
}