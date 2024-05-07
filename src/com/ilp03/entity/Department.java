package com.ilp03.entity;

public class Department {
	private int id;
	private String deptName;

	public Department(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	public Department() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
