package com.servletjsp.dao.impl;

import java.util.List;

import com.servletjsp.model.CategoryModel;

public interface ICategoryDAO {
	List<CategoryModel> findAll();
}
