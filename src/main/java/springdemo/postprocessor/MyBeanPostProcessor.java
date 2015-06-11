package springdemo.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("Bean后处理器_AfterInit:"+beanName);
		return obj;
	}

	public Object postProcessBeforeInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("Bean后处理器_BeforeInit:"+beanName);
		return obj;
	}

}
