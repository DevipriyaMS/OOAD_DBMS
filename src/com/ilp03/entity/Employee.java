package com.ilp03.entity;

import java.util.Date;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private Date dob;
	private double contact;
	private String address;
	private Date joindate;
	private JobRole jobrole;

	public Employee(int id, String firstname, String lastname, Date dob, double contact, String address, Date joindate,
			JobRole jobrole) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
		this.joindate = joindate;
		this.jobrole = jobrole;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getContact() {
		return contact;
	}

	public void setContact(double contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public JobRole getJobrole() {
		return jobrole;
	}

	public void setJobrole(JobRole jobrole) {
		this.jobrole = jobrole;
	}

}
