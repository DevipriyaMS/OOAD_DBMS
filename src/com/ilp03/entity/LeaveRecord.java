package com.ilp03.entity;

import java.util.Date;

public class LeaveRecord {
	private int leaverequestId;
	private Employee employee;
	private JobRole jobrole;
	private LeaveDetail leavedetail;
	private PayRoll payroll;
	private Date startDate;
	private Date endDate;
	private Date approvalDate;
	private String status;
	private String comments;
	private Date createdDate;
	private Date updatedDate;

	public LeaveRecord(int leaverequestId, Employee employee, JobRole jobrole, LeaveDetail leavedetail, PayRoll payroll,
			Date startDate, Date endDate, Date approvalDate, String status, String comments, Date createdDate,
			Date updatedDate) {
		super();
		this.leaverequestId = leaverequestId;
		this.employee = employee;
		this.jobrole = jobrole;
		this.leavedetail = leavedetail;
		this.payroll = payroll;
		this.startDate = startDate;
		this.endDate = endDate;
		this.approvalDate = approvalDate;
		this.status = status;
		this.comments = comments;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public LeaveRecord() {

	}

	public int getLeaverequestId() {
		return leaverequestId;
	}

	public void setLeaverequestId(int leaverequestId) {
		this.leaverequestId = leaverequestId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public JobRole getJobrole() {
		return jobrole;
	}

	public void setJobrole(JobRole jobrole) {
		this.jobrole = jobrole;
	}

	public LeaveDetail getLeavedetail() {
		return leavedetail;
	}

	public void setLeavedetail(LeaveDetail leavedetail) {
		this.leavedetail = leavedetail;
	}

	public PayRoll getPayroll() {
		return payroll;
	}

	public void setPayroll(PayRoll payroll) {
		this.payroll = payroll;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}