package com.servletjsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servletjsp.dao.impl.INewsDAO;
import com.servletjsp.model.NewsModel;

public class NewsDAO implements INewsDAO {
	public Connection getConnection() {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servlet_jsp_jdbc";
			String usr = "root";
			String pwd = "";
			return DriverManager.getConnection(url, usr, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		List<NewsModel> results = new ArrayList<>();
		String sql = "SELECT * FROM news WHERE categoryId = ?";
		// open Connection
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Connection conn = getConnection();
		if (conn != null) {
			try {
				statement = conn.prepareStatement(sql);
				statement.setLong(1, categoryId);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					NewsModel news = new NewsModel();
					news.setId(resultSet.getLong("id"));
					news.setTitle(resultSet.getString("title"));
					results.add(news);
				}
				return results; // Chạy thành công!
			} catch (SQLException e) {
				return null;
			} finally {
				try {
					// Dùng xong đóng tất cả lại!
					if (conn != null) {
						conn.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					}
				} catch (SQLException e) {
					return null;
				}
			}
		}
		return null; // Chạy không thành công!
	}


}