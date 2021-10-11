package com.servletjsp.dao.impl;

import java.util.List;

import com.servletjsp.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
}
