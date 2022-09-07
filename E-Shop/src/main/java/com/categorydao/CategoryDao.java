package com.categorydao;

import java.util.List;

import com.model.Category;

public interface CategoryDao {

	public List<Category> getAllCategory();
	public Category getCatById(int id);
	public void addOrUpdateCate(Category cat);
	public void deleteCategory(int id);
}
