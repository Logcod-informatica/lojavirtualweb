
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Listar pessoas</title>
</head>
<body>

	<h1>Listar pessoas</h1>
	


<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Chave key</th>
      <th scope="col">Nome</th>
      <th scope="col">E-mail</th>
      <th scope="col">Contato</th>
    </tr>
  </thead>
  <c:forEach items="${values}" var="p">
  <tbody>
  
    <tr>
      <th scope="row">${p.getIdPessoa()}</th>
      <td>${p.getNome()}</td>
      <td>${p.getEmail()}</td>
      <td>${p.getContact()}</td>
      <td><a href="Controller?operacao=EditarPessoa&acao=pessoa&idPessoa=${p.getIdPessoa()}" class="btn btn-primary">Editar</a> </td>
      <td><a href="Controller?operacao=DeletePessoa&acao=pessoa&idPessoa=${p.getIdPessoa()}" class="btn btn-danger">Remover</a></td>
    </tr>
   
   
  </tbody>
  </c:forEach> 
</table>




	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>