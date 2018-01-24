package com.nt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory=null;
	private static Session session=null;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
static{
	factory=new Configuration().configure("com/nt/cfgs/hibernate.cfg.xml").buildSessionFactory();
}

//Open Session
public static Session getSession(){
	
	System.out.println(" in session-----"+threadLocal.get());
	if(threadLocal.get()==null)
	{
	session=factory.openSession();
	System.out.println(session+"****************");
	threadLocal.set(session);
	}
	else{
		session=threadLocal.get();
	}
	return session;
}//method



//Close the Session
public static void closeSession()
{
	if(threadLocal.get()!=null)
		{
		threadLocal.get().close();
		threadLocal.remove();
		
		
		}

	
}
//Close the Session Factory
public static void closeSessionFaactory(){
	factory.close();
	
}


}
