package org.loja.controller.subcontroller.pessoa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.entity.Pessoa;
import org.loja.repository.RepositoryPessoa;

public class ViewPessoas implements ModelAndView {
    RepositoryPessoa rp = new RepositoryPessoa();

	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		List<Pessoa> pessoas = rp.getPessoas();		
	    request.setAttribute("values",pessoas);		
		return "paginas/pessoas/listar-pessoas.jsp";
	}

}
