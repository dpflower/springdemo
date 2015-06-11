package springdemo.service;

import java.util.List;

import springdemo.dao.UserDao;
import springdemo.entity.UserInfo;

public class UserServiceImpl implements UserService {
	
	UserDao userDao;	
	
	public UserServiceImpl(){
		
	}
	
	public UserServiceImpl(UserDao userDao){
		this.userDao = userDao;
	}
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
	
	public void addUser(UserInfo user) {
		userDao.addUser(user);

	}

	public List<UserInfo> getUsers() {
		return userDao.getUsers();		
	}

}
