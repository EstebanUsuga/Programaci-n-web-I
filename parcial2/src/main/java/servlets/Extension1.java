package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/extension")
public class Extension1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setAttribute("atributoReq", (new SecureRandom().nextInt(1) + 100));
		
		HttpSession alcanceSesion = request.getSession();
 		alcanceSesion.setAttribute("atributoSes", new Date());
		
		ServletContext alcanceApp = request.getServletContext();
		alcanceApp.setAttribute("atributoApp", new Punto(3.5, 8.1));
		
		
		request.getRequestDispatcher("segundo").forward(request, response);
		out.println("Ir a <a href='segundo'> Segundo (Extension2)</a>");


}
}