package cn.itcast.s2sh0808.dao;

import java.io.Serializable;
import java.util.List;

import cn.itcast.s2sh0808.domain.Person;

public interface PersonDao {
	public void savePerson(Person person);
	
	public Person getPersonById(Serializable id);
}
