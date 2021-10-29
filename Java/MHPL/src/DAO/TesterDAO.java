package DAO;

import java.io.IOException;
import java.util.ArrayList;

import DTO.StaffDTO;
import DTO.TesterDTO;

public class TesterDAO extends StaffDAO {
	public ArrayList<TesterDTO> getAllTester() throws IOException {
		StaffDAO staffDAO = new StaffDAO(){};
		ArrayList<StaffDTO> listStaffDAO = staffDAO.getAlls();

		ArrayList<TesterDTO> listTesterDTO = new ArrayList<TesterDTO>();
		for (StaffDTO i : listStaffDAO) {
			TesterDTO testerDTO = new TesterDTO();
			if (i.getId().indexOf("TESTER") != -1) {
				testerDTO.setId(i.getId());
				testerDTO.setName(i.getName());
				testerDTO.setAge(i.getAge());
				testerDTO.setPhone(i.getPhone());
				testerDTO.setMail(i.getMail());
				testerDTO.setBasic_salary(i.getBasic_salary());
				testerDTO.setErrors(i.getTemp());
				testerDTO.setSalary((Integer.parseInt(i.getBasic_salary()) + testerDTO.getErrors() * 50000) + "");

			}
			listTesterDTO.add(testerDTO);
		}
		return listTesterDTO;
	}
}
