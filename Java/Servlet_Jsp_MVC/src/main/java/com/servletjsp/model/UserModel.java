package com.servletjsp.model;

import java.sql.Timestamp;

public class UserModel extends AbstractModel {
	private String userName;
	private String passWord;
	private String fullName;
	private Byte status;
	private Long roleId;
	
	public UserModel() {
		super();
	}
	public UserModel(Long id, String userName, String passWord, String fullName,
			Byte status, Long roleId, Timestamp createdDate, Timestamp modifiedDate, String createdBy, String modifiedBy) {
		super(id, createdDate, modifiedDate, createdBy, modifiedBy);
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		this.status = status;
		this.roleId = roleId;
	}
	public UserModel(UserModel usrM) {
		super(usrM.id, usrM.createdDate, usrM.modifiedDate, usrM.createdBy, usrM.modifiedBy);
		this.userName = usrM.userName;
		this.passWord = usrM.passWord;
		this.fullName = usrM.fullName;
		this.status = usrM.status;
		this.roleId = usrM.roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
