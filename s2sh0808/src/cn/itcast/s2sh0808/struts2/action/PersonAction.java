package cn.itcast.s2sh0808.struts2.action;

import org.apache.struts2.ServletActionContext;

import cn.itcast.s2sh0808.domain.Person;
import cn.itcast.s2sh0808.service.PersonService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.DefaultActionInvocation;
import com.opensymphony.xwork2.ObjectFactory;

public class PersonAction extends ActionSupport{
	
	public PersonAction(){
		System.out.println("person action");
	}
	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public String savePerson(){
		Person person = new Person();
		person.setPname("林志玲");
		personService.savePerson(person);
		return null;
	}
	
	public String showChart(){
		return SUCCESS;
	}
	
	public String aa(){
		return "java0909";
	}
	
	public String getPerson(){
		Person person = this.personService.getPersonById(1L);
		ServletActionContext.getRequest().setAttribute("person", person);
		return "index";
	}
}
