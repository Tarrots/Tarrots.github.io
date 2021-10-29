package BUS;

import java.io.IOException;
import java.util.ArrayList;

import DAO.DevDAO;
import DTO.DevDTO;

public class DevBUS {
	DevDAO devDAO = new DevDAO();
	public ArrayList<DevDTO> getAllDev() throws IOException{
        return devDAO.getAllDev();
    }

}
