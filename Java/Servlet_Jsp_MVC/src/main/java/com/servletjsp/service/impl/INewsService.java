package com.servletjsp.service.impl;

import java.util.List;

import com.servletjsp.model.NewsModel;

public interface INewsService {
	List<NewsModel> findByCategoryId(Long categoryId);
	NewsModel save(NewsModel newsM);
}
