package com.servletjsp.service;

import java.util.List;

import javax.inject.Inject;

import com.servletjsp.dao.NewsDAO;
import com.servletjsp.dao.impl.INewsDAO;
import com.servletjsp.model.NewsModel;
import com.servletjsp.service.impl.INewsService;

public class NewsService implements INewsService {
	@Inject
	private INewsDAO newsD;
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newsD.findByCategoryId(categoryId);
	}
	@Override
	public NewsModel save(NewsModel newsM) {
		// TODO Auto-generated method stub
		return null;
	}
}
