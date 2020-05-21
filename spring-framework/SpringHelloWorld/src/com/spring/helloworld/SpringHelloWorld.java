package com.spring.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorld {

	public static void main(String[] args) {
		/*
		 * If we use ApplicationContext instead of ClassPathXmlApplicationContext then
		 * it always notify that Resource leak: 'context' is never closed so I used
		 * ClassPathXmlApplicationContext using try with resource
		 */
		/*
		 * ClassPathXmlApplicationContext interpret plain path as class path so it will
		 * find into class path if you are using custom paths like
		 * config/HelloWorldBeans.xml then config should set in class path otherwise you
		 * have to use FileSystemXmlApplicationContext or else you can use file as
		 * prefix like ClassPathXmlApplicationContext(
		 * "file:/Your_Dirs/SpringHelloWorld/config/HelloWorldBeans.xml").
		 */
		/*
		 * We can also use XmlBeanFactory beanFactory = new XmlBeanFactory(new
		 * ClassPathResource("HelloWorldBeans.xml")); but it is Deprecated. as of Spring
		 * 3.1 in favor of DefaultListableBeanFactory and XmlBeanDefinitionReader
		 */
		/*
		 * We can also use WebXmlApplicationContext − This container loads the XML file
		 * with definitions of all beans from within a web application.
		 */
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("HelloWorldBeans.xml")) {
			HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
			/*
			 * if we are not using this getter method then also we can print our message by
			 * overriding toString in HelloWorld but it is not useful because spring
			 * framework uses the DI and we use set then it's always better to use getter
			 */
			helloWorld.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// use can use this also
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("HelloWorldBeans.xml"); HelloWorld helloWorld
		 * = (HelloWorld) context.getBean("helloworld"); helloWorld.getMessage();
		 */

	}
}
