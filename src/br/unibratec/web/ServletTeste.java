package br.unibratec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teste")
public class ServletTeste extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3878682706056895791L;

	protected void service (HttpServletRequest pRequest, HttpServletResponse pResponse) throws ServletException, IOException {
		PrintWriter pw = pResponse.getWriter();
		
		pw.println("<html>");
			pw.println("<body>");
				pw.println("Servlet funcionando!");
			pw.println("<body>");
		pw.println("</html>");
	}
	
}
