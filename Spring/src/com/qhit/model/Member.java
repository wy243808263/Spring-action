package com.qhit.model;

/**
 * �û�ʵ����
 * 
 * @author Administrator
 * 
 */
public class Member {
	private int id;
	private String userNo;// ��Ա���
	private String userName;// ��Ա����
	private String sex;// �Ա�
	private int age;// ����
	private String userID;// ��������
	private String telePhone;// ��ϵ�绰
	private String address;// ��ַ
	private String joinDate;// ��������
	private String userCard;// ���֤����

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getTelePhone() {
		return telePhone;
	}

	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getUserCard() {
		return userCard;
	}

	public void setUserCard(String userCard) {
		this.userCard = userCard;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", userNo=" + userNo + ", userName=" + userName + ", sex=" + sex + ", age=" + age + ", userID=" + userID + ", telePhone=" + telePhone + ", address=" + address
				+ ", joinDate=" + joinDate + ", userCard=" + userCard + "]";
	}
}