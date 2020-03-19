package org.loja.controller.subcontroller.pessoa;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.entity.Pessoa;
import org.loja.repository.RepositoryPessoa;

public class InserirPessoa implements ModelAndView {
    RepositoryPessoa rp = new RepositoryPessoa();
	
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int idPessoa = Integer.valueOf(request.getParameter("idPessoa"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		Pessoa pessoa = new Pessoa();
		pessoa.setIdPessoa(idPessoa);
		pessoa.setNome(name);
		pessoa.setEmail(email);
		pessoa.setContact(contact);	
		
		System.out.println(pessoa);
		if(idPessoa==0) {
			rp.save(pessoa);
			System.out.println("sucessfull");
		}else {			
			rp.update(pessoa);
			System.out.println("sucessfull atualizar");
		}
		return "Controller?operacao=ViewPessoas&acao=pessoa";
	}

}
