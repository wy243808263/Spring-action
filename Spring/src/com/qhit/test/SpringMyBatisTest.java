package com.qhit.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qhit.mapper.UserMapper;
import com.qhit.model.Member;

public class SpringMyBatisTest {
	static ApplicationContext context;
	static UserMapper mapper;

	public static void main(String[] args) {
		new SpringMyBatisTest().del();
	}

	public SpringMyBatisTest() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		mapper = (UserMapper) context.getBean("userDao");
	}

	/**
	 * 查询全部
	 */
	public void findAll() {
		List<Member> members = mapper.selectAllUser();
		for (Member member : members) {
			System.out.println(member.toString());
		}
	}

	/**
	 * 保存
	 */
	public void save() {
		Member member = new Member();
		member.setJoinDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		member.setUserName("啦啦啦");
		member.setAge(22);
		member.setUserID(2222 + "");
		member.setTelePhone("13045678901");
		member.setUserNo(2345678 + "");
		member.setAddress("北京");
		member.setUserCard("410311188734567891");
		member.setSex("男");
		mapper.insertUser(member);
	}

	/**
	 * 修改
	 */
	public void update() {
		Member member = mapper.selectUserById(2);
		member.setJoinDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		member.setUserName("啦啦啦");
		member.setAge(23);
		member.setUserID(2222 + "");
		member.setTelePhone("13045678901");
		member.setUserNo(2345678 + "");
		member.setAddress("北京");
		member.setUserCard("410311188734567891");
		member.setSex("女");
		mapper.updateUser(member);
	}

	/**
	 * 删除
	 */
	public void del() {
		mapper.delUser(2);
	}
}