package org.loja.controller.subcontroller.pessoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.repository.RepositoryPessoa;

public class DeletePessoa implements ModelAndView{
    RepositoryPessoa rp = new RepositoryPessoa();
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String idPessoa = request.getParameter("idPessoa");
		rp.delete(Integer.valueOf(idPessoa));
		return "Controller?operacao=ViewPessoas&acao=pessoa";
	}

}
