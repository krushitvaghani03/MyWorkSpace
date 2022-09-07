package com.model;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String catname;
	
	@OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
	List<Product> products;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	
}
