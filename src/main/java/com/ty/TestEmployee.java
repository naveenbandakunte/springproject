package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployee {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Config.xml");
		BeanFactory beanfactory=new XmlBeanFactory(resource);
		Employee e=(Employee)beanfactory.getBean("abc");
		System.out.println("employee id is: "+e.getId());
		System.out.println("employee name is: "+e.getName());
		System.out.println("employee age is: "+e.getAge());
		

	}

}
