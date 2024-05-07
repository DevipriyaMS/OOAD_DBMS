package com.ilp03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.entity.Employee;
import com.ilp03.entity.JobRole;
import com.ilp03.entity.LeaveDetail;
import com.ilp03.entity.LeaveRecord;
import com.ilp03.entity.PayRoll;

public class LeaveRecordDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/humanresource_db?useSSL=false";
		String userName = "root";
		String password = "Experion23#";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertIntoLeaveRecord(Connection connection, int employeeId, int leavetypeId, Date startDate, Date endDate, int approvedby, Date approvalDate, String status, String comments, int createdBy, int updatedBy, Date createdDate, Date updatedDate) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO leave_records (employee_id, leavetype_id, start_date, end_date, approved_by, approval_date, status, comments, created_by, updated_by, created_date, updated_date)VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");
 
			preparedStatement.setInt(1,employeeId );
			preparedStatement.setInt(2,leavetypeId );
			preparedStatement.setDate(3,startDate);
			preparedStatement.setDate(4,endDate);
			preparedStatement.setInt(5,approvedby );
			preparedStatement.setDate(6,approvalDate);
			preparedStatement.setString(7,status);
			preparedStatement.setString(8,comments);
			preparedStatement.setInt(9,createdBy);
			preparedStatement.setInt(10,updatedBy);
			preparedStatement.setDate(11,createdDate);
			preparedStatement.setDate(12,updatedDate);


			int rowsInserted = preparedStatement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("Data inserted successfully!");
	        } else {
	            System.out.println("Failed to insert Data.");
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<LeaveRecord> getLeaveHistoryByEmployeeName(Connection connection, String employeeName) {
		ArrayList<LeaveRecord> leaveHistory = new ArrayList<>();

		System.out.println(employeeName);

		try {
			String query = "SELECT e.firstname, e.lastname, lr.start_date, lr.end_date, lr.status, lr.comments, ld.leave_type, jr.job_title, pr.basepay, pr.lossofpay FROM employees e INNER JOIN leave_records lr ON e.id = lr.employee_id INNER JOIN leave_details ld ON lr.leavetype_id = ld.id INNER JOIN job_roles jr ON e.role_id = jr.id INNER JOIN pay_roll pr ON e.id = pr.employee_id WHERE e.firstname = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, employeeName);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {

				Employee employee = new Employee();
				String firstname = resultSet.getString(1);
				employee.setFirstname(firstname);
				String lastname = resultSet.getString(2);
				employee.setLastname(lastname);
				Date startDate = resultSet.getDate(3);
				Date endDate = resultSet.getDate(4);
				String status = resultSet.getString(5);
				String comments = resultSet.getString(6);
				LeaveDetail leavedetail = new LeaveDetail();
				String leaveType = resultSet.getString(7);
				leavedetail.setLeaveType(leaveType);
				JobRole jobrole = new JobRole();
				String jobTitle = resultSet.getString(8);
				jobrole.setJobTitle(jobTitle);
				PayRoll payroll = new PayRoll();
				Double basepay = resultSet.getDouble(9);
				Double lossofpay = resultSet.getDouble(10);
				payroll.setBasepay(basepay);
				payroll.setLossofpay(lossofpay);

				LeaveRecord leaverecord = new LeaveRecord();
				leaverecord.setEmployee(employee);
				leaverecord.setStartDate(startDate);
				leaverecord.setEndDate(endDate);
				leaverecord.setStatus(status);
				leaverecord.setComments(comments);
				leaverecord.setLeavedetail(leavedetail);
				leaverecord.setJobrole(jobrole);
				leaverecord.setPayroll(payroll);

				leaveHistory.add(leaverecord);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return leaveHistory;
	}
}
