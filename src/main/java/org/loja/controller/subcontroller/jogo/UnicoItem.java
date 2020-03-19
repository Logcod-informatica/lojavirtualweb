package org.loja.controller.subcontroller.jogo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.carro.MeuCarro;
import org.loja.controller.subcontroller.ModelAndView;
import org.loja.entity.Carro;
import org.loja.entity.Jogo;
import org.loja.repository.RepositoryJogo;

public class UnicoItem implements ModelAndView {
	RepositoryJogo rj = new RepositoryJogo();
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		String value = request.getParameter("unica");
		Jogo jogo = rj.getJogo(value);			
		Carro carro = new Carro();
		carro.setIndex(MeuCarro.getAuto());
		carro.setValue(jogo.getValue());
		carro.setQtd(MeuCarro.getAuto());
	    MeuCarro.setCarro(carro);
	    MeuCarro.comprandoItem();	
	    
	    request.setAttribute("carrinho", MeuCarro.getCarros());
		return "Controller?operacao=LojaVirtual&acao=jogo";
	}

}
