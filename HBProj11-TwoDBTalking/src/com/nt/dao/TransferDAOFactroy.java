package com.nt.dao;

public class TransferDAOFactroy {
	public static TransferDAO getInstaance()
	{
		return new TranferDAOImpl();
	}

}
