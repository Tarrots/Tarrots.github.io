package GUI;

import java.io.IOException;

import BUS.StaffBUS;
import DTO.StaffDTO;

public class StaffGUI {
	public static void main(String[] args) throws IOException {
		StaffBUS staffbus = new  StaffBUS();
		System.out.println("Average Salary: " +
					staffbus.getAverageSalary().toString() + "\n");
		System.out.println("List of employees whose salary is lower than the average salary:");
		for (StaffDTO i : staffbus.getListLessAvgSalary()) {
			System.out.println("ID: " + i.getId() + " - Name: " + i.getName() +
					" - Salary: " + i.getSalary());
		  }
	}
}