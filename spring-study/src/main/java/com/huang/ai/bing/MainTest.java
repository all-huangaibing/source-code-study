package com.huang.ai.bing;

import com.huang.ai.bing.aop.MathCalculator;
import com.huang.ai.bing.config.MainConfig;
import com.huang.ai.bing.config.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Person bean = (Person) applicationContext.getBean("person");
//		System.out.println(bean);
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);

		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
		int div = mathCalculator.div(12, 0);
		System.out.println("div = " + div);

		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String name : namesForType) {
			System.out.println(name);
		}
	
	}

}