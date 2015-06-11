package springdemo.service;

import java.util.List;

import springdemo.entity.UserInfo;

public interface UserService {

	void addUser(UserInfo user);
	
	List<UserInfo> getUsers();
	
}
