package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Shopcart {

	@Id
	int cartId;
	
	@JoinColumn(name = "pid")
	@ManyToMany
	List<Product> products;
	
	int pQty;
	
	@JoinColumn(name = "id")
	@ManyToMany
	List<User> users;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getpQty() {
		return pQty;
	}

	public void setpQty(int pQty) {
		this.pQty = pQty;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
}
