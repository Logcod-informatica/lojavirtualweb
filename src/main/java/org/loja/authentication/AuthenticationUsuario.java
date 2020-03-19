package org.loja.authentication;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthenticationUsuario
 */
@WebServlet("/AuthenticationUsuario")
public class AuthenticationUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("login");
		String passwd=request.getParameter("senha");
		HttpSession session = request.getSession(true);
		session.setAttribute("logado", login);
		
		if (Objects.nonNull(login) 
				&& !Objects.equals(login, "") 
				&&  Objects.equals(login, "diocesse") ) {
			request.getRequestDispatcher("login.html").forward(request, response);
		}else {
			request.getRequestDispatcher("login.html").forward(request, response);
		}
		
	}

}
