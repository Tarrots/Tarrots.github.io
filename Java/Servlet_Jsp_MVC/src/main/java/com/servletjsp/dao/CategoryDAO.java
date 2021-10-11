package com.servletjsp.dao;

import java.util.List;

import com.servletjsp.controller.mapper.CategoryMapper;
import com.servletjsp.dao.impl.ICategoryDAO;
import com.servletjsp.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {
	

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return (query(sql, new CategoryMapper()));
	}

}
