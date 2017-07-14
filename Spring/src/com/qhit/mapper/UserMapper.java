package com.qhit.mapper;

import java.util.List;

import com.qhit.model.Member;

public interface UserMapper {

	/**
	 * 查询所有会员信息
	 * 
	 * @return
	 */
	public List<Member> selectAllUser();

	/**
	 * 根据会员编号查询会员信息
	 * 
	 * @param id
	 * @return
	 */
	public Member selectUserById(int id);

	/**
	 * 新增用戶
	 * 
	 * @param m
	 * @return
	 */
	public int insertUser(Member m);

	/**
	 * 修改会员
	 * 
	 * @param m
	 * @return
	 */
	public int updateUser(Member m);

	/**
	 * 根据编号删除会员
	 * 
	 * @param id
	 *            编号
	 * @return
	 */
	public int delUser(int id);
}