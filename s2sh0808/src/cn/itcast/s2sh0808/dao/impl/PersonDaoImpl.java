package cn.itcast.s2sh0808.dao.impl;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.s2sh0808.dao.PersonDao;
import cn.itcast.s2sh0808.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}

	public Person getPersonById(Serializable id) {
		// TODO Auto-generated method stub
		Person person = (Person)this.getHibernateTemplate().load(Person.class, 1L);
		this.getHibernateTemplate().clear();
		//person.getPname();
		return person;
	}
	
}
