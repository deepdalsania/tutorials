package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "item")
@SessionScoped
public class Item {

	private String name;
	private int qty;
	private long price;

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public long getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String insert() {
		System.out.print(name + "   " + qty + "   " + price);
		if (price < 10000)
			return "Failure";
		return "Success";
	}

}
