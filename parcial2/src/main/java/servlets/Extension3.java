package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tercero")
public class Extension3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Integer val = (Integer) request.getAttribute("atributoReq");
		
		Date fecha = (Date) request.getSession().getAttribute("atributoSes");
		
		Punto pto = (Punto) request.getServletContext().getAttribute("atributoApp");
		
		out.println("<h3>Estoy en /tercero (Extension3)</h3>");
		out.println("<span>Número al azar del 1 al 100: " + val +"</span> <br>");
		out.println("<span>Fecha: " + fecha +" </span> <br>");
		out.println("<span>Comprobar alcance aplicación: " + pto +" </span> <br>");
		out.println();
		
		request.getSession().invalidate();

		
	}
}
