package com.servletjsp.dao.impl;

import java.util.List;

import com.servletjsp.controller.mapper.RowMapper;

public interface GenericDAO<T> {
	/*
	 * T là kiểu dữ liệu bất định
	 * Object...parameter: muti param
	 * */
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object...parameters);
	
}
