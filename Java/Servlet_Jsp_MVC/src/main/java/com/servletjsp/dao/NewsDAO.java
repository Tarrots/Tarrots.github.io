package com.servletjsp.dao;

import java.util.List;

import com.servletjsp.controller.mapper.NewsMapper;
import com.servletjsp.dao.impl.INewsDAO;
import com.servletjsp.model.NewsModel;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryId = ?";
		return (query(sql, new NewsMapper(), categoryId));
	}

	@Override
	public Long save(NewsModel newS) {
		String sql = "INSERT INTO news (title, content, categoryId) VALUES (?, ?, ?)";
		
		return null;
	}


}