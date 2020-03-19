package org.loja.controller.subcontroller.jogo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.carro.MeuCarro;
import org.loja.controller.subcontroller.ModelAndView;

public class RemoveItem implements ModelAndView {
    MeuCarro mc = new MeuCarro();
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		String value = request.getParameter("value");
		mc.remove(value);
		return "Controller?operacao=LojaVirtual&acao=jogo";
	}

}
