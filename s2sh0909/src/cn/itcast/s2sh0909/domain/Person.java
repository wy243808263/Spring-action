package cn.itcast.s2sh0909.domain;

import java.io.Serializable;

public class Person implements Serializable{
	private Long pid;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	private String pname;
}
