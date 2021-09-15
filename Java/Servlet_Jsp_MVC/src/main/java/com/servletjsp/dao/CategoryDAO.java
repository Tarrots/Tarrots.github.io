package com.servletjsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servletjsp.dao.impl.ICategoryDAO;
import com.servletjsp.model.CategoryModel;

public class CategoryDAO implements ICategoryDAO {
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
	public List<CategoryModel> findAll() {
		List<CategoryModel> results = new ArrayList<>();
		String sql = "SELECT * FROM category";
		// open Connection
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Connection conn = getConnection();
		if (conn != null) {
			try {
				statement = conn.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					CategoryModel category = new CategoryModel();
					category.setId(resultSet.getLong("id"));
					category.setCode(resultSet.getString("code"));
					category.setName(resultSet.getString("name"));
					results.add(category);
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
