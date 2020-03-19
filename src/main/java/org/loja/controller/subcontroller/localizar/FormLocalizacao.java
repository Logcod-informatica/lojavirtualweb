package org.loja.controller.subcontroller.localizar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;

public class FormLocalizacao implements ModelAndView {

	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		
		return "paginas/enderecos/form-localizacao.jsp";
	}

}
