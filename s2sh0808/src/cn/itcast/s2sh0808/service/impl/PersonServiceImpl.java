package cn.itcast.s2sh0808.service.impl;

import java.io.Serializable;

import cn.itcast.s2sh0808.dao.PersonDao;
import cn.itcast.s2sh0808.domain.Person;
import cn.itcast.s2sh0808.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}

	public Person getPersonById(Serializable id) {
		// TODO Auto-generated method stub
		Person person =  this.personDao.getPersonById(id);
		return person;
	}
}
