package com.servletjsp.model;

import java.sql.Timestamp;

public class CommentsModel extends AbstractModel {
	private String content;
	private Long usrId;
	private Long newsId;

	public CommentsModel() {
		super();
	}

	public CommentsModel(Long id, String content, Long usrId, Long newsId, Timestamp createdDate,
			Timestamp modifiedDate, String createdBy, String modifiedBy) {
		super(id, createdDate, modifiedDate, createdBy, modifiedBy);
		this.content = content;
		this.usrId = usrId;
		this.newsId = newsId;	
	}

	public CommentsModel(CommentsModel commentsM) {
		super(commentsM.id, commentsM.createdDate, commentsM.modifiedDate, commentsM.createdBy, commentsM.modifiedBy);
		this.content = commentsM.content;
		this.usrId = commentsM.usrId;
		this.newsId = commentsM.newsId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getUsrId() {
		return usrId;
	}

	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}
}
