package com.categoryservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.categorydao.CategoryDao;
import com.model.Category;

@Service
public class CategoryServiceImpl implements categoryservice {

	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategory();
	}

	@Override
	public Category getCatById(int id) {
		// TODO Auto-generated method stub
		return categoryDao.getCatById(id);
	}

	@Override
	public void addOrUpdateCate(Category cat) {
		
		categoryDao.addOrUpdateCate(cat);
	}

	@Override
	public void deleteCategory(int id) {

		categoryDao.deleteCategory(id);
	}

}
