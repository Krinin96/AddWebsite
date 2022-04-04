package org.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.CalculatorService.Add;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int numOne = Integer.parseInt(req.getParameter("num1"));
		int numTwo = Integer.parseInt(req.getParameter("num2"));		
		PrintWriter out = res.getWriter();		
		out.println( "sum: " + new Add().add(numOne, numTwo));		
	}
}
