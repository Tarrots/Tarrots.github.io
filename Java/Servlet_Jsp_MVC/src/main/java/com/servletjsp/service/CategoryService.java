package com.servletjsp.service;

import java.util.List;

import javax.inject.Inject;

import com.servletjsp.dao.impl.ICategoryDAO;
import com.servletjsp.model.CategoryModel;
import com.servletjsp.service.impl.ICategoryService;

public class CategoryService implements ICategoryService{
	@Inject // Servlet Weld
	private ICategoryDAO categoryD;

	@Override
	public List<CategoryModel> findAll() {
		return categoryD.findAll();
	}

}
