package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class SRControllerServlet extends  HttpServlet {
	@Override
public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		//All Properties
		String sno=null;
		String sname=null;
		String m1=null;
		String m2=null;
		String m3=null;
		String result=null;
		StudentVO vo=null;
		StudentDTO dto=null;
		StudentService service=null;
		
		//Get Data from enduser
		sno=req.getParameter("sno");
		sname=req.getParameter("sname");
		m1=req.getParameter("m1");
		m2=req.getParameter("m2");
		m3=req.getParameter("m3");
		System.out.println("Value from form :"+m1+m2+m3);
	// Prepare VO
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		System.out.println("Value from vo :"+vo.getM1()+vo.getM2()+vo.getM3());
		
		
		
		//Prepare DTO
		
		dto=new StudentDTO();
		dto.setSno(Integer.parseInt(sno));
		dto.setSname(sname);
		dto.setM1(Integer.parseInt(m1));
		dto.setM2(Integer.parseInt(m2));
		dto.setM3(Integer.parseInt(m3));
		System.out.println("M1"+dto.getM1()+"M2"+dto.getM2()+"M3"+dto.getM3());
		
		
service=new StudentService();
result=service.getResult(dto);
req.setAttribute("resultMsg",result);
RequestDispatcher rd=req.getRequestDispatcher("/result.jsp");
		
		if(rd!=null)
			
			rd.forward(req, res);
		
	
	}//doGet(-,-)
	
@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	doGet(req,res);
}//doPosst(-,-)

}
