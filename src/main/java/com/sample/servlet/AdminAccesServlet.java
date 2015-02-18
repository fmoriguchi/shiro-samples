/**
 * 
 */
package com.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * @author fabio
 *
 */
@WebServlet(value="/admin")
public final class AdminAccesServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();		
		
		writeSuccessMessage(out);
		
		out.close();
	}
	
	/**
	 * 
	 * @param out
	 */
	private void writeSuccessMessage(PrintWriter out) {
		
		Subject subject = SecurityUtils.getSubject();
		
		StringBuilder message = new StringBuilder();
		
		message.append("<h1>")
		.append("Hello ")
		.append(subject.getPrincipal())
		.append("</h1>");
		
		out.println(message);
	}
}
