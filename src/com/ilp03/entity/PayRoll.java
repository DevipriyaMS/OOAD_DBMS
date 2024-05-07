package com.ilp03.entity;

import java.util.Date;

public class PayRoll {
	private int id;
	private Employee employeeId;
	private double basepay;
	private double lossofpay;
	private Date paydate;

	public PayRoll(int id, Employee employeeId, double basepay, double lossofpay, Date paydate) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.basepay = basepay;
		this.lossofpay = lossofpay;
		this.paydate = paydate;
	}

	public PayRoll() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public double getBasepay() {
		return basepay;
	}

	public void setBasepay(double basepay) {
		this.basepay = basepay;
	}

	public double getLossofpay() {
		return lossofpay;
	}

	public void setLossofpay(double lossofpay) {
		this.lossofpay = lossofpay;
	}

	public Date getPaydate() {
		return paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

}
