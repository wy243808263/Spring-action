package com.cg.entity;

import com.base.entity.BaseEntity;
/**
 * 
 * <br>
 * <b>功能：</b>AccountEntity<br>
 */
public class Account extends BaseEntity {
	
		private java.lang.Integer id;//   	private java.lang.String accountName;//   	private java.lang.String password;//   	private java.lang.String accountType;//   	private java.lang.String description;//   	private java.lang.String status;//   	private java.sql.Timestamp createTime;//   	private java.lang.Integer deleteStatus;//   逻辑删除状态0:存在1:删除	public java.lang.Integer getId() {	    return this.id;	}	public void setId(java.lang.Integer id) {	    this.id=id;	}	public java.lang.String getAccountName() {	    return this.accountName;	}	public void setAccountName(java.lang.String accountName) {	    this.accountName=accountName;	}	public java.lang.String getPassword() {	    return this.password;	}	public void setPassword(java.lang.String password) {	    this.password=password;	}	public java.lang.String getAccountType() {	    return this.accountType;	}	public void setAccountType(java.lang.String accountType) {	    this.accountType=accountType;	}	public java.lang.String getDescription() {	    return this.description;	}	public void setDescription(java.lang.String description) {	    this.description=description;	}	public java.lang.String getStatus() {	    return this.status;	}	public void setStatus(java.lang.String status) {	    this.status=status;	}	public java.sql.Timestamp getCreateTime() {	    return this.createTime;	}	public void setCreateTime(java.sql.Timestamp createTime) {	    this.createTime=createTime;	}	public java.lang.Integer getDeleteStatus() {	    return this.deleteStatus;	}	public void setDeleteStatus(java.lang.Integer deleteStatus) {	    this.deleteStatus=deleteStatus;	}
}

