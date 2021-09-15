package com.servletjsp.model;

import java.sql.Timestamp;

public class CategoryModel extends AbstractModel {
	private String name;
	private String code;
	public CategoryModel() {
		super();
	}
	public CategoryModel(Long id, String name, String code, Timestamp createdDate, Timestamp modifiedDate,
			String createdBy, String modifiedBy) {
		super(id, createdDate, modifiedDate, createdBy, modifiedBy);
		this.name = name;
		this.code = code;
	}
	public CategoryModel(CategoryModel categoryM) {
		super(categoryM.id, categoryM.createdDate, categoryM.modifiedDate, categoryM.createdBy, categoryM.modifiedBy);
		this.name = categoryM.name;
		this.code = categoryM.code;
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
