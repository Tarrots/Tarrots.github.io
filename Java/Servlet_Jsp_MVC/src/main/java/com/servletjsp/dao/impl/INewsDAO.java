package com.servletjsp.dao.impl;

import java.util.List;

import com.servletjsp.model.NewsModel;

public interface INewsDAO {
	List<NewsModel> findByCategoryId(Long categoryId);
}
