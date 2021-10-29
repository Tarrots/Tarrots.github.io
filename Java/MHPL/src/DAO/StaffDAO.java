package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import DTO.StaffDTO;

public class StaffDAO {
	public ArrayList<StaffDTO> getAlls() throws IOException {
		ArrayList<StaffDTO> listStaffDTO = new ArrayList<StaffDTO>();
		// Read data
		FileReader fr = new FileReader("./CSDL/Data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, "-");
			StaffDTO staffDTO = new StaffDTO() {
			};
			// Add ArrayList
			while (st.hasMoreTokens()) {
				// System.out.println(st.nextToken()); // Test data
				staffDTO.setId(st.nextToken().toString());
				staffDTO.setName(st.nextToken().toString());
				staffDTO.setAge(Integer.parseInt(st.nextToken().toString()));
				staffDTO.setPhone(st.nextToken().toString());
				staffDTO.setMail(st.nextToken().toString());
				staffDTO.setBasic_salary(st.nextToken().toString());
				staffDTO.setTemp(Integer.parseInt(st.nextToken().toString()));	
			}
			listStaffDTO.add(staffDTO);
			line = br.readLine();
		}
		br.close();
		fr.close();
		return listStaffDTO;
	}
	public String getAverageSalary() throws IOException {
		int averageSalary = 0;
		StaffDAO staffDAO = new StaffDAO();
		ArrayList<StaffDTO> listStaffDTO = staffDAO.getAlls();
		for (StaffDTO i : listStaffDTO) {
		      if(i.getId().indexOf("DEV") != -1)
		      {
		    	  averageSalary += Integer.parseInt(i.getBasic_salary()) + i.getTemp() * 200000;
		      }
		      if(i.getId().indexOf("TESTER") != -1)
		      {
		    	  averageSalary += Integer.parseInt(i.getBasic_salary()) + i.getTemp() * 50000;
		      }
		    }
		return (averageSalary / listStaffDTO.size()) + "";
	}
	public ArrayList<StaffDTO> getListLessAvgSalary() throws IOException{
		ArrayList<StaffDTO> listLessAvgSalary = new ArrayList<StaffDTO>(); 
		String averageSalary = this.getAverageSalary();
		StaffDAO staffDAO = new StaffDAO();
		ArrayList<StaffDTO> listStaffDTO = staffDAO.getAlls();
		for (StaffDTO i : listStaffDTO) {
		      if(i.getId().indexOf("DEV") != -1)
		      {
		    	  if((Integer.parseInt(i.getBasic_salary()) + i.getTemp() * 200000) < Float.parseFloat(averageSalary))
		    	  {
		    		  i.setSalary((Integer.parseInt(i.getBasic_salary()) + i.getTemp() * 200000) + "");
		    		  listLessAvgSalary.add(i);
		    	  }
		      }
		      if(i.getId().indexOf("TESTER") != -1)
		      {
		    	  if((Integer.parseInt(i.getBasic_salary()) + i.getTemp() * 50000) < Float.parseFloat(averageSalary))
		    	  {
		    		  i.setSalary((Integer.parseInt(i.getBasic_salary()) + i.getTemp() * 50000) + "");
		    		  listLessAvgSalary.add(i);
		    	  }
		      }
		    }
		return listLessAvgSalary;
	}
}
