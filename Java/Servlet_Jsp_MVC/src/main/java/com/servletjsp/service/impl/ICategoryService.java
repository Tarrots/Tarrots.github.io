package com.servletjsp.service.impl;

import java.util.List;

import com.servletjsp.model.CategoryModel;

public interface ICategoryService {
	List<CategoryModel> findAll();
}
