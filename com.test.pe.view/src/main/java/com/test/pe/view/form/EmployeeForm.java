package com.test.pe.view.form;

public class EmployeeForm {
	private int id;
	private String name;
	private EmployeeTypeForm type;
	private int telephone;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeTypeForm getType() {
		return type;
	}

	public void setType(EmployeeTypeForm type) {
		this.type = type;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
