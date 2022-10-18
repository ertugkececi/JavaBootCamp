package nLayeredKodlama_io.entities;

import nLayeredKodlama_io.core.entities.Entity;

public class Category implements Entity {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
