package com.ilp03.utility;

import java.util.Scanner;
import com.ilp03.service.LeaveRecordServiceImpl;

public class HumanResourceUtility {

	public static void main(String[] args) {
						 
				char continueQuery='y';
		        Scanner scanner=new Scanner(System.in);
		        LeaveRecordServiceImpl leaveRecordService = new LeaveRecordServiceImpl();
				do {
					System.out.println("-------Choose------- \n1. Insert a LeaveRecord \n2. Display LeaveRecord of a particular Employee \n3. Exit");
					int choice=scanner.nextInt();
					switch(choice) {
					case 1: leaveRecordService.insertIntoLeaveRecord();
					break;
					case 2:leaveRecordService.getLeaveHistoryByEmployeeName();
					break;
					case 3:
						System.out.println("Thankyou :) ");
						break;
					default: System.out.println("Invalid Choice");
					break;
					}
					System.out.println("Go to main menu (y/n)");
					continueQuery = scanner.next().charAt(0);
			}
				while(continueQuery=='y');
					}
		 
		}

