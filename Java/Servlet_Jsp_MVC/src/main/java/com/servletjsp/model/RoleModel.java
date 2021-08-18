package com.servletjsp.model;

import java.sql.Timestamp;

public class RoleModel {
	private Long id;
	private String name;
	private String code;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private String createdBy;
	private String modifiedBy;
	
	public RoleModel() {
		
	}
	public RoleModel(Long id, String name, String code, Timestamp createdDate, Timestamp modifiedDate,
			String createdBy, String modifiedBy) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}
	public RoleModel(RoleModel roleM) {
		this.id = roleM.id;
		this.name = roleM.name;
		this.code = roleM.code;
		this.createdDate = roleM.createdDate;
		this.modifiedDate = roleM.modifiedDate;
		this.createdBy = roleM.createdBy;
		this.modifiedBy = roleM.modifiedBy;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}