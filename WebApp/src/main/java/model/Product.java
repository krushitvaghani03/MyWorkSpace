package model;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "pid")
	int pId;
	@Column(name = "pname")
	String pNAME;
	@Column(name = "price")
	String price;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "cid")
	Category category;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpNAME() {
		return pNAME;
	}

	public void setpNAME(String pNAME) {
		this.pNAME = pNAME;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
