package com.servletjsp.model;

import java.sql.Timestamp;

public class RoleModel extends AbstractModel {
	private String name;
	private String code;
	public RoleModel() {
		
	}
	public RoleModel(Long id, String name, String code, Timestamp createdDate, Timestamp modifiedDate,
			String createdBy, String modifiedBy) {
		this.name = name;
		this.code = code;
	}
	public RoleModel(RoleModel roleM) {
		this.name = roleM.name;
		this.code = roleM.code;
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
}