package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
 @Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	int cId;
	@Column(name = "catname")
	String catName;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	List<Product> products;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product tempProduct) 
	{
			if(products == null)
			{
				products = new ArrayList();
			}
			products.add(tempProduct);
		
	}
	
	
	
}
