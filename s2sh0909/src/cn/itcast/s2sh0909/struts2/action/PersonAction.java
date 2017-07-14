package cn.itcast.s2sh0909.struts2.action;

import cn.itcast.s2sh0909.domain.Person;
import cn.itcast.s2sh0909.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{
	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public String savePerson(){
		Person person = new Person();
		person.setPname("0909班美女班主任");
		personService.savePerson(person);
		return null;
	}
}
