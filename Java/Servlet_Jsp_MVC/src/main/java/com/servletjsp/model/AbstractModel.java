package com.servletjsp.model;

import java.sql.Timestamp;

public abstract class AbstractModel {
	protected Long id;
	protected Timestamp createdDate;
	protected Timestamp modifiedDate;
	protected String createdBy;
	protected String modifiedBy;

	public AbstractModel() {

	}

	public AbstractModel(Long id, Timestamp createdDate, Timestamp modifiedDate, String createdBy, String modifiedBy) {
		this.id = id;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}

	public AbstractModel(AbstractModel AbsM) {
		this.id = AbsM.id;
		this.createdDate = AbsM.createdDate;
		this.modifiedDate = AbsM.modifiedDate;
		this.createdBy = AbsM.createdBy;
		this.modifiedBy = AbsM.modifiedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
