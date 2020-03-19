package org.loja.controller.subcontroller.jogo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.repository.RepositoryJogo;

public class ItensLojaVirtual implements ModelAndView {
	RepositoryJogo rj = new RepositoryJogo();
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		try {
			String filtro = request.getParameter("filtro");
	       	request.setAttribute("jogos", rj.getJogos(filtro));	
	       	request.setAttribute("painel", "Painel de informações");
	       	System.out.println(rj.getJogos(""));
	       	return "paginas/loja/loja.jsp"	;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
		} catch (Exception e) {
			return "paginas/loja/loja.jsp";
			
		}
        
		
	}

}
