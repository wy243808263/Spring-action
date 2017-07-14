package cn.itcast.s2sh0909.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SesssionFactoryTest extends BaseSpring{
	@Test
	public void testSessionFactory(){
		SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
	}
}
