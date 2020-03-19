package org.loja.controller.subcontroller.jogo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.carro.MeuCarro;
import org.loja.controller.subcontroller.ModelAndView;
import org.loja.repository.RepositoryJogo;

public class LojaVirtual implements ModelAndView {
	
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(MeuCarro.getCarros());
        request.setAttribute("carrinho", MeuCarro.getCarros());
        request.setAttribute("qtd", MeuCarro.getCarros().size());
		return "paginas/carrinho/meu-carrinho.jsp";
	}

}
