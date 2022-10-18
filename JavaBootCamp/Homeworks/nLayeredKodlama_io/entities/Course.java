package nLayeredKodlama_io.entities;

import nLayeredKodlama_io.core.entities.Entity;

public class Course implements Entity {
	private int id;
	private String name;
	private double price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
