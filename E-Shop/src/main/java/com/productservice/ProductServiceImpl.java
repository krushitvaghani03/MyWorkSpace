package com.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.productdao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	@Override
	public void addOrUpdateProduct(Product cat) {
		
		productDao.addOrUpdateProduct(cat);
	}

	@Override
	public void deleteProduct(int id) {
		
		productDao.deleteProduct(id);
	}

}
