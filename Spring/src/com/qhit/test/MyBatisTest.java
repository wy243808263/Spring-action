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
		// 使用MyBatis提供的Resources类加载mybatis的配置文件
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("MyBatis-Config.xml");
			// 构建SqlSession工厂
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// 获取session
			SqlSession sqlSession = sessionFactory.openSession();
			// 指定mapper
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