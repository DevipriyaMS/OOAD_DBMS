package com.ilp03.entity;

public class LeaveDetail {
	private int id;
	private String leaveType;
	private int allowedDuration;

	public LeaveDetail(int id, String leaveType, int allowedDuration) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.allowedDuration = allowedDuration;
	}

	public LeaveDetail() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getAllowedDuration() {
		return allowedDuration;
	}

	public void setAllowedDuration(int allowedDuration) {
		this.allowedDuration = allowedDuration;
	}

}
