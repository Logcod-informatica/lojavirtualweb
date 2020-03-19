package org.loja.controller.subcontroller.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.repository.RepositoryJogo;

public class IndexController implements ModelAndView
{
    RepositoryJogo rj = new RepositoryJogo();
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("jogos", rj.getJogos(""));
		return "index.jsp";
	}

}
