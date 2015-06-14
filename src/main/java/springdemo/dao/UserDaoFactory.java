package springdemo.dao;

public class UserDaoFactory {
	public UserDao getUserDao(){
		return new UserDaoImpl();
	}	
	

}
