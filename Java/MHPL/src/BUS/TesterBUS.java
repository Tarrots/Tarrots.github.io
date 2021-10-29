package BUS;

import java.io.IOException;
import java.util.ArrayList;

import DAO.TesterDAO;
import DTO.TesterDTO;

public class TesterBUS {
	TesterDAO testerDAO = new TesterDAO();
	public ArrayList<TesterDTO> getAllTester() throws IOException{
        return testerDAO.getAllTester();
    }
}
