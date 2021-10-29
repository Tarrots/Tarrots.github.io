package DAO;

import java.io.IOException;
import java.util.ArrayList;

import DTO.DevDTO;
import DTO.StaffDTO;

public class DevDAO extends StaffDAO {
	public ArrayList<DevDTO> getAllDev() throws IOException {
		
		StaffDAO staffDAO = new StaffDAO(){};
		ArrayList<StaffDTO> listStaffDAO = staffDAO.getAlls();

		ArrayList<DevDTO> listDevDTO = new ArrayList<DevDTO>();

		for (StaffDTO i : listStaffDAO) {
			DevDTO devDTO = new DevDTO();
			if (i.getId().indexOf("DEV") != -1) {
				devDTO.setId(i.getId());
				devDTO.setName(i.getName());
				devDTO.setAge(i.getAge());
				devDTO.setPhone(i.getPhone());
				devDTO.setMail(i.getMail());
				devDTO.setBasic_salary(i.getBasic_salary());
				devDTO.setTime(i.getTemp());
				devDTO.setSalary((Integer.parseInt(i.getBasic_salary()) + devDTO.getTime() * 200000) + "");

			}
			listDevDTO.add(devDTO);
		}
		return listDevDTO;
	}
}
