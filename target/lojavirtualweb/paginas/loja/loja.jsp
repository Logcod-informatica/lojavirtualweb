
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>																																																											
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  >
																																																																																																																																																																																																								
<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="../assets/img/apple-icon.png">
<link rel="icon" type="image/png" href="../assets/img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Loja de Jogos</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'
	name='viewport' />
<!--     Fonts and icons     -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200"
	rel="stylesheet" />
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<!-- CSS Files -->
<link href="./assets/css/bootstrap.min.css" rel="stylesheet" />
<link href="./assets/css/paper-dashboard.css?v=2.0.0" rel="stylesheet" />
<!-- CSS Just for demo purpose, don't include it in your project -->
<link href="./assets/demo/demo.css" rel="stylesheet" />
</head>
<div class="row ">
	<c:forEach var="jg" items="${jogos}">
		<div class="col-lg-3 col-md-6 col-sm-6" >
			<div class="card card-stats">
				<div class="card-body ">
					<div class="row">

						<div class="col-5 col-md-4">
							<div class="icon-big text-center icon-warning">
								<i class="nc-icon nc-user-run"></i>
							</div>
						</div>
						<div class="col-7 col-md-8">
							<div class="numbers">
								<p class="card-category" > ${jg.isDisponivel()}
									
								</p>
								<p class="card-title" >${jg.getValue()}
							</div>

						</div>


					</div>
				</div>
				<div class="card-footer ">
					<hr>
					<div class="stats">
						<a 
							href="Controller?operacao=ItemJogado&acao=jogo&item=${jg.getValue()}"
							style="text-decoration: none;"> <i class="nc-icon nc-simple-add"></i> Adicionar
						</a>
						<a
							href="Controller?operacao=UnicoItem&acao=jogo&unica=${jg.getValue()}"
							style="text-decoration: none;" class="btn btn-primary btn-sm"> | Comprar item
						</a>
					</div>
				</div>
			</div>
		</div>
	
	</c:forEach>
	
	
</div>