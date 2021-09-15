package com.servletjsp.model;

import java.sql.Timestamp;

public class RoleModel extends AbstractModel {
	private String name;
	private String code;

	public RoleModel() {
		super();
	}

	public RoleModel(Long id, String name, String code, Timestamp createdDate, Timestamp modifiedDate, String createdBy,
			String modifiedBy) {
		super(id, createdDate, modifiedDate, createdBy, modifiedBy);
		this.name = name;
		this.code = code;
	}

	public RoleModel(RoleModel roleM) {
		super(roleM.id, roleM.createdDate, roleM.modifiedDate, roleM.createdBy, roleM.modifiedBy);
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