package com.ilp03.entity;

public class JobRole {
	private int id;
	private Department deptId;
	private String jobTitle;

	public JobRole(int id, Department deptId, String jobTitle) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.jobTitle = jobTitle;
	}

	public JobRole() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDeptId() {
		return deptId;
	}

	public void setDeptId(Department deptId) {
		this.deptId = deptId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
