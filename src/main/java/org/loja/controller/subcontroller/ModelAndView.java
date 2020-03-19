package org.loja.controller.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ModelAndView {
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response);

}
