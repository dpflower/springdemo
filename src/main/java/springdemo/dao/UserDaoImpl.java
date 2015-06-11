package springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import springdemo.entity.UserInfo;

public class UserDaoImpl implements UserDao {
	
	private static List<UserInfo> users = new ArrayList<UserInfo>();
	
	static {
		UserInfo userInfo = new UserInfo();
		userInfo.setAge(10);
		userInfo.setUserName("Xiao Ming");
		users.add(userInfo);
		userInfo = new UserInfo();
		userInfo.setAge(20);
		userInfo.setUserName("Da Bai");
		users.add(userInfo);
	}
	

	public void addUser(UserInfo user) {
		users.add(user);
		System.out.println("添加用户：" + user);
	}

	public List<UserInfo> getUsers() {		
		System.out.println("获取全部用户列表");
		return users;
	}

}
