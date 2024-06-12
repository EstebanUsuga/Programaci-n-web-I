package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario")
public class FormCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");	
		
		String tipoIdentificacion = request.getParameter("tipoIdent");
		String identifica = request.getParameter("identificacion");
		String nom = request.getParameter("nombre");
		String direc = request.getParameter("direccion");
		String telef = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		String txtFecha = request.getParameter("fecha");
		Date fecha = null;
		try {
			fecha = sdf.parse(txtFecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boolean clienteActivo = request.getParameter("clienteAct") != null;
		Double capaciCredito = Double.parseDouble(request.getParameter("capaciCredi"));
		
		String categoriaP = request.getParameter("radio") == null ? "Ninguno" : request.getParameter("radio");
		

		
		//Guardamos la información de las variables del formulario en un objeto:
		Cliente cliente = new Cliente(tipoIdentificacion, identifica, nom, direc, telef, correo, fecha, clienteActivo,capaciCredito,categoriaP);
		
		//Creamos el atributo "Cliente" con los valores del objeto creado arriba
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

	
	}