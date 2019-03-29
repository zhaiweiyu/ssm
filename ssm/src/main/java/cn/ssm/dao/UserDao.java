package cn.ssm.dao;

import org.springframework.stereotype.Service;

import cn.ssm.domain.User;

@Service
public interface UserDao {
	
	User findByUserName(String userNames);
}
