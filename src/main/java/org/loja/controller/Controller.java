package org.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.repository.RepositoryJogo;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RepositoryJogo rj = new RepositoryJogo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String subcontroller = "org.loja.controller." + "subcontroller." + request.getParameter("acao") + "."
				+ request.getParameter("operacao");
        try {
			Class<?> operacao = Class.forName(subcontroller);
			ModelAndView mv = (ModelAndView) operacao.newInstance();
			String redirect = mv.setViewName(request, response);
			request.setAttribute("painel", "Painel de informações");
			request.getRequestDispatcher(redirect).forward(request, response);
		} catch (Exception e) {		
			request.setAttribute("painel", "Painel de informações");
			request.getRequestDispatcher("Controller?operacao=LojaVirtual&acao=jogo").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
