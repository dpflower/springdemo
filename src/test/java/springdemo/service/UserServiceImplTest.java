package springdemo.service;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import springdemo.entity.UserInfo;

public class UserServiceImplTest {

	static ApplicationContext beanFactory;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		beanFactory = new FileSystemXmlApplicationContext("classpath*:applicationContext.xml");
			
	}
	
	@Before
	public void setUp() throws Exception {
	}
	

	

	@Test
	public void testUser() {
		UserService userService = (UserService)beanFactory.getBean("userService");	
		//UserService userService = beanFactory.getBean(UserService.class);
		UserInfo user = new UserInfo();
		user.setAge(30);
		user.setUserName("test");
		userService.addUser(user);
		
		List<UserInfo> users = userService.getUsers();
		for (UserInfo userInfo : users) {
			System.out.println(userInfo);
		}
		
		
		
	}

}
