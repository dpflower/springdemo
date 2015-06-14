package springdemo.dao;

public class UserDaoStaticFactory {

	public static UserDao getUserDao() {
		return new UserDaoImpl();
	}
}
