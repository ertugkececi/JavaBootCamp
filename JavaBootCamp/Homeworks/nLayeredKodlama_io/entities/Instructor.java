package nLayeredKodlama_io.entities;

import nLayeredKodlama_io.core.entities.Entity;

public class Instructor implements Entity {
	private int id;
	private String name;
	private String surname;
	private double salary;
	private String phoneNumber;
	private String indentityNumber;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIndentityNumber() {
		return indentityNumber;
	}

	public void setIndentityNumber(String indentityNumber) {
		this.indentityNumber = indentityNumber;
	}

}
