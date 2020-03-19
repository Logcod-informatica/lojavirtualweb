package org.loja.controller.subcontroller.pessoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;

public class FormPessoa implements ModelAndView{

	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "paginas/pessoas/formpessoa.jsp";
	}

}
