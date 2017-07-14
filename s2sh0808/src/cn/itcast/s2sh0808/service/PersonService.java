package cn.itcast.s2sh0808.service;

import java.io.Serializable;

import cn.itcast.s2sh0808.domain.Person;

public interface PersonService {
	public void savePerson(Person person);
	
	public Person getPersonById(Serializable id);
}
