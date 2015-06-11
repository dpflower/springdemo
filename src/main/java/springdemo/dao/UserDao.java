package springdemo.dao;

import java.util.List;

import springdemo.entity.UserInfo;

public interface UserDao {
	
	void addUser(UserInfo user);
	
	List<UserInfo> getUsers();

}
