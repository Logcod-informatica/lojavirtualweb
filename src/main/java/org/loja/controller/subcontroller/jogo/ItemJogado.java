package org.loja.controller.subcontroller.jogo;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.loja.controller.carro.MeuCarro;
import org.loja.controller.subcontroller.ModelAndView;
import org.loja.entity.Carro;
import org.loja.entity.Jogo;
import org.loja.repository.RepositoryJogo;

public class ItemJogado implements ModelAndView {
   RepositoryJogo rj = new RepositoryJogo();    
   int quantidade=0;
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		String url="index.jsp";
		try {
						
			Jogo jogo = rj.getJogo(request.getParameter("item"));			
			Carro carro = new Carro();
			carro.setIndex(MeuCarro.getAuto());
			carro.setValue(jogo.getValue());
			carro.setQtd(MeuCarro.getAuto());
		    MeuCarro.setCarro(carro);
		    MeuCarro.comprandoItem();		
		    
		    url = "Controller?operacao=ItensLojaVirtual&acao=jogo";
			
		    	
		} catch (Exception e) {
		  System.out.println(e.getLocalizedMessage());
		}
			return url;
	}

}
