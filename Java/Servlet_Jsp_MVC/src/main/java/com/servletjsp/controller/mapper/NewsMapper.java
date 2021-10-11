package com.servletjsp.controller.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.servletjsp.model.NewsModel;

public class NewsMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet resultSet) {
		try {
			NewsModel news = new NewsModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			return news;
		} catch (SQLException e) {
			return null;
		}

	}

}
