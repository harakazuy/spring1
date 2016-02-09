package jp.hara.spring.sample1;

import org.springframework.cache.annotation.AnnotationCacheOperationSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext app;

	public static void main(String[] args) {
		app = new AnnotationConfigApplicationContext(AutoMyBeanConfig.class);
		MyBeanInterface bean = app.getBean(MyBeanInterface.class);
		System.out.println(bean);
	}

}
