package com.servletjsp.dao.impl;

import java.util.List;

import com.servletjsp.model.NewsModel;

public interface INewsDAO extends GenericDAO<NewsModel> {
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newS);
}
