package com.qhit.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qhit.mapper.UserMapper;

public class MyBatisTest {

	public static SqlSessionFactory sessionFactory;

	public static void main(String[] args) {
		// ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("MyBatis-Config.xml");
			// ����SqlSession����
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// ��ȡsession
			SqlSession sqlSession = sessionFactory.openSession();
			// ָ��mapper
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.selectUserById(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSession getSession() {
		return sessionFactory.openSession();
	}
}