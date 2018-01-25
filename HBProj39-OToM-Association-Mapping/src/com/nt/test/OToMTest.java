package com.nt.test;

import com.nt.dao.OToMDAO;
import com.nt.dao.OToMDAOFactoty;

public class OToMTest {
	public static void main(String[] args) {
		
		
		OToMDAO dao=OToMDAOFactoty.getInstance();
		
		dao.saveData();
	}

}
