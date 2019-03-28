package cn.ssm.dao;

import cn.ssm.domain.User;

public interface UserDao {
	
	User findByUserName(String userNames);
}
