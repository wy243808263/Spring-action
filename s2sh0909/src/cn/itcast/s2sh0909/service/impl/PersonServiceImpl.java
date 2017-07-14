package cn.itcast.s2sh0909.service.impl;

import cn.itcast.s2sh0909.dao.PersonDao;
import cn.itcast.s2sh0909.domain.Person;
import cn.itcast.s2sh0909.service.PersonService;

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
}
