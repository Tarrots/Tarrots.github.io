package BUS;

import java.io.IOException;
import java.util.ArrayList;

import DAO.StaffDAO;
import DTO.StaffDTO;

public class StaffBUS {
	StaffDAO staffDAO = new StaffDAO();
	public ArrayList<StaffDTO> getAlls() throws IOException{
        return staffDAO.getAlls();
    }
	public String getAverageSalary() throws IOException {
		return staffDAO.getAverageSalary();
	}
	public ArrayList<StaffDTO> getListLessAvgSalary() throws IOException{
		return staffDAO.getListLessAvgSalary();
	}
}
