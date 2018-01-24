package com.nt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OracleHibernateUtil {
	private static SessionFactory factory=null;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	
	static{
		//BildSessionFactory 
		factory=new Configuration().configure("com/nt/cfgs/Oraclehibernate.cfg.xml").buildSessionFactory();
	}
	//Open Session
	public static Session getSession(){
		Session session=null;
	if(threadLocal.get()==null){
	session=factory.openSession();
	}
	return session;
}//Method eND
	//Close  Session
	public static void closeSession()
	{if(threadLocal.get()!=null){
		threadLocal.get().close();
		threadLocal.remove();
	}//if

}//method End 
	//CloseSessionFactory
	public static void CloseSessionFactory(){
		factory.close();
	}//End of Method
	
}
