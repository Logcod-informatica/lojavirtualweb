<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Cadastrar</title>
</head>
<body>
	<h1>Realiazando jogos</h1>
	<form action="Controller" method="post">
		<table class="">
			<thead>
				<td>Nome</td>
				<td>E-mail</td>
				<td>Contato</td>
			</thead>
			<tr>
				<td><input name="name" value="${pessoa.getNome()}" type="text"
					placeholder="Nome completo" /></td>
				<td><input name="email" value="${pessoa.getEmail()}"
					type="email" placeholder="Informe seu @email" /></td>
				<td><input name="contact" value="${pessoa.getContact()}"
					type="tel" placeholder="Informe seu contato" /></td>
				<td><input type="submit" value="Inserir" /></td>
			</tr>

			<tr>
				<td><input type="hidden" name="idPessoa"
					value="0${pessoa.getIdPessoa()}" /></td>

				<td><input name="operacao" type="hidden" value="InserirPessoa" />
				</td>
				<td><input name="acao" type="hidden" value="pessoa" /></td>
			</tr>
		</table>
	</form>
	<form action="Controller">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Numero</th>
					<th scope="col">Insira os numeros que você deseja adicionar</th>
					<th scope="col"><input name="item" type="text"
						placeholder="Informe o milhar" /> <input value="Carregar"
						type="submit" class="btn btn-outline-success my-2 my-sm-0" /></th>

				</tr>
				<tr hidden="true">
					<td><input type="hidden" name="operacao" value="ItemJogado" />
					</td>
					<td><input type="hidden" name="acao" value="jogo" /></td>
				</tr>

			</thead>
           
		</table>
		
	</form>

	<table class="table table-bordered">
			
				
           <c:forEach items="${meuCarro}" var="c">
           <tbody>
			<tr>
				<td>${c.getIndex()}</td>
				<td >${c.getValue()}</td>
				<td >${c.getValue()}</td>
			</tr>
			</tbody>
			</c:forEach>
		</table>
		


</body>
</html>