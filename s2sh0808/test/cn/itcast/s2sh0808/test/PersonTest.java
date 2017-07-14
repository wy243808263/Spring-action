package cn.itcast.s2sh0808.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.s2sh0808.dao.PersonDao;
import cn.itcast.s2sh0808.domain.Person;
import cn.itcast.s2sh0808.service.PersonService;
import cn.itcast.s2sh0808.struts2.action.PersonAction;

public class PersonTest {
	@Test
	public void testSavePerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setPname("林志玲");
		personService.savePerson(person);
	}
	
	@Test
	public void testPersonAction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		PersonAction personAction = (PersonAction)context.getBean("personAction");
	}
	
	@Test
	public void testPersonDao(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		Person person = personDao.getPersonById(1L);//调用完以后session关闭了
		//person.getPname();
	}
	
	@Test
	public void testPersonService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = personService.getPersonById(1L);
		person.getPname();
	}
}
