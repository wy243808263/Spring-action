package cn.itcast.s2sh0909.test;

import org.junit.Test;

import cn.itcast.s2sh0909.domain.Person;
import cn.itcast.s2sh0909.service.PersonService;

public class PersonTest extends BaseSpring{
	@Test
	public void testSavePerson(){
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setPname("0909班美女班主任");
		personService.savePerson(person);
	}
}
