package com.servletjsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.servletjsp.controller.mapper.RowMapper;
import com.servletjsp.dao.impl.GenericDAO;

public class AbstractDAO<T> implements GenericDAO<T> {
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
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameter) {
		List<T> results = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			conn = getConnection();
			statement = conn.prepareStatement(sql);
			setParameter(statement,parameter);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				results.add(rowMapper.mapRow(resultSet));
			}
			return results;
		} catch (SQLException e) {
			return null;
		}finally {
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

	private void setParameter(PreparedStatement statement, Object...parameters) {
		try {
			for(int i = 0; i < parameters.length; i++)
			{
				Object parameter = parameters[i];
				int index = i + 1;
				if(parameter instanceof Long) {
					statement.setLong(index,(Long)parameter);
				} else if(parameter instanceof String) {
					statement.setString(index,(String)parameter);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
