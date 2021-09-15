package com.servletjsp.model;

import java.sql.Timestamp;

public class NewsModel extends AbstractModel {
	private String title;
	private String thumbnail;
	private String shortDescription;
	private String content;
	private Long categoryId;
	private String categoryCode;

	public NewsModel() {
		super();
	}

	public NewsModel(Long id, String title, String thumbnail,String shortDescription,
			String content, Long categoryId, String categoryCode, Timestamp createdDate, Timestamp modifiedDate,
			String createdBy, String modifiedBy) {
		super(id, createdDate, modifiedDate, createdBy, modifiedBy);
		this.title = title;
		this.thumbnail = thumbnail;
		this.shortDescription = shortDescription;
		this.content = content;
		this.categoryId = categoryId;
		this.categoryCode = categoryCode;
	}

	public NewsModel(NewsModel newsM) {
		super(newsM.id, newsM.createdDate, newsM.modifiedDate, newsM.createdBy, newsM.modifiedBy);
		this.title = newsM.title;
		this.thumbnail = newsM.thumbnail;
		this.shortDescription = newsM.shortDescription;
		this.content = newsM.content;
		this.categoryId = newsM.categoryId;
		this.categoryCode = newsM.categoryCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

}