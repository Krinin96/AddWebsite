package org.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.CalculatorService.CalculatorMath;

public class MathServlet extends HttpServlet {

	// will only accept post request
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int numOne = Integer.parseInt(req.getParameter("num1"));
		int numTwo = Integer.parseInt(req.getParameter("num2"));
		String symbol = req.getParameter("symbol");
		PrintWriter out = res.getWriter();

		String outString = numOne + " " + symbol + " " + numTwo + " =";
		outString += new CalculatorMath().doMath(numOne, numTwo,symbol);
		out.println(outString);

		// RequestDispatcher dispatcher = req.getRequestDispatcher();
		// dispatcher.forward(req, res);
	}
}
