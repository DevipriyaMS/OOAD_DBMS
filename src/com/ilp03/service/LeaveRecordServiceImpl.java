package com.ilp03.service;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.ilp03.dao.LeaveRecordDAO;
import com.ilp03.entity.LeaveRecord;

public class LeaveRecordServiceImpl implements LeaveRecordService {

	@Override
	public void getLeaveHistoryByEmployeeName() {
		try {
			Connection connection = LeaveRecordDAO.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Name of the Employee :\n");
			String employeeName = scanner.nextLine().trim();
			List<LeaveRecord> leaveHistory = LeaveRecordDAO.getLeaveHistoryByEmployeeName(connection,
					employeeName.toUpperCase());
			if (leaveHistory.isEmpty()) {
				System.out.println("No leave history found for employee: " + employeeName);
			} else {
				System.out.println("----Leave History for Employee: " + employeeName+"----");
				for (LeaveRecord leaverecord : leaveHistory) {
					
					System.out.println("---------------------------------------------------");
					System.out.println("| Employee:         |"+leaverecord.getEmployee().getFirstname()+" "+leaverecord.getEmployee().getLastname());
					System.out.println("| Job Title:        |"+leaverecord.getJobrole().getJobTitle());
					System.out.println("| Leave Type:       |"+leaverecord.getLeavedetail().getLeaveType());
					System.out.println("| Leave Start Date: |"+leaverecord.getStartDate());
					System.out.println("| Leave End Date:   |"+leaverecord.getEndDate());
					System.out.println("| Leave Status:     |"+leaverecord.getStatus());
					System.out.println("| Comments:         |"+leaverecord.getComments());
					System.out.println("| BasePay:          |"+leaverecord.getPayroll().getBasepay());
					System.out.println("| Loss of Pay:      |"+leaverecord.getPayroll().getLossofpay());
					System.out.println("---------------------------------------------------");



				}

				connection.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Override
	public void insertIntoLeaveRecord() {

		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = LeaveRecordDAO.getConnection();
			System.out.println("Enter Employee ID:");
			int employeeId = scanner.nextInt();
			System.out.println(
					"Enter LeaveType ID:\n1.Annual Leave, 2.Sick Leave, 3. Unpaid Leave, 4.Maternity Leave\n 5.Paternity Leave, 6.Vacation Leave, 7.Study Leave, 8.Bereavement Leave");
			int leavetypeId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Start Date: (YYYY-MM-DD)");
			String dateString1 = scanner.nextLine();
			Date startDate = Date.valueOf(dateString1);
			System.out.println("Enter End Date:(YYYY-MM-DD)");
			String dateString2 = scanner.nextLine();
			Date endDate = Date.valueOf(dateString2);
			System.out.println("Enter ID of Employee who approved the leave:");
			int approvedby = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Approved Date:(YYYY-MM-DD)");
			String dateString3 = scanner.nextLine();
			Date approvalDate = Date.valueOf(dateString3);
			System.out.println("Enter Status of the leave:");
			String status = scanner.nextLine();
			System.out.println("Comments:");
			String comments = scanner.nextLine();
			System.out.println("Enter ID of Employee who created the leave:");
			int createdby = scanner.nextInt();
			System.out.println("Enter ID of Employee who updated the leave:");
			int updatedby = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Created Date:(YYYY-MM-DD)");
			String dateString4 = scanner.nextLine();
			Date createdDate = Date.valueOf(dateString4);
			scanner.nextLine();
			System.out.println("Enter Updated Date:(YYYY-MM-DD)");
			String dateString5 = scanner.nextLine();
			Date updatedDate = Date.valueOf(dateString5);

			LeaveRecordDAO.insertIntoLeaveRecord(connection, employeeId, leavetypeId, startDate, endDate, approvedby,
					approvalDate, status, comments, createdby, updatedby, createdDate, updatedDate);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
