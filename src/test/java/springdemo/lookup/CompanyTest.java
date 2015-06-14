package springdemo.lookup;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CompanyTest {

	static ApplicationContext beanFactory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		beanFactory = new FileSystemXmlApplicationContext("classpath*:applicationContext.xml");
			
	}

	@Test
	public void test() {
		Company company = beanFactory.getBean("company", Company.class);
        company.meet();
        company.meet();
        company.meet();
        company.meet();
        company.meet();
        company.meet();
	}

}
