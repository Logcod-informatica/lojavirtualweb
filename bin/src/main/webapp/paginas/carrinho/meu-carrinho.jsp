
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
<body>
<div class="border" >
		
			<div class="col-lg-6 col-md-6 col-sm-6" >
			<div class="card card-stats">
				<div class="card-body ">
					<div class="row">

						<div class="col-5 col-md-4">
							<div class="icon-big text-center icon-warning">
								<i class="nc-icon nc-money-coins"></i>
							</div>
							<p>Faça a finalização do pagamento:</p>
						</div>
						<div class="col-7 col-md-8">
							<div class="numbers">
								<p class="card-category" > <c:out value="Volor pagar:"/> </p>
								<p class="card-title" ><c:out value="R$ ${qtd * 5 },00"/> 
								<p><c:out value=" Itens: ${qtd}"/></p>
							</div>

						</div>


					</div>
				</div>
				<div class="card-footer ">
					<hr>
					<div class="stats">
						
						<a
							href="Controller?operacao=FinalizarCompra&acao=jogo"
							style="text-decoration: none;" class="btn btn-primary btn-sm"> Finalizar pagamento
						</a> | <a
							href="Controller?operacao=ItensLojaVirtual&acao=jogo"
							style="text-decoration: none;" class="btn btn-sucess btn-sm"> Continuar comprando
						</a>
					</div>
				</div>
				
			</div>
		</div>

	
	</div>
	<div class="row ">
		<c:forEach var="jg" items="${carrinho}">
			<div class="col-lg-3 col-md-6 col-sm-6">
				<div class="card card-stats">
					<div class="card-body ">
						<div class="row">

							<div class="col-5 col-md-4">
								<div class="icon-big text-center icon-warning">
									<i class="nc-icon nc-check-2"></i>
								</div>
							</div>
							<div class="col-7 col-md-8">
								<div class="numbers">
									<p class="card-category">Item selecionado</p>
									<p class="card-title">
										<c:out value="${jg.value}" />
								</div>

							</div>


						</div>
					</div>
					<div class="card-footer ">
						<hr>
						<div class="stats">

							<a
								href="Controller?operacao=RemoveItem&acao=jogo&value=<c:out value="${jg.value}"/>"
								style="text-decoration: none;" class="btn btn-danger btn-sm">
								Remover item </a>
						</div>
					</div>
				</div>

			</div>

		</c:forEach>
	</div>
	
	<div class="alert alert-danger alert-dismissible fade show"
		role="alert">
		<strong>Para finalizar a compra dos numeros será preciso
			realizar o cadastro do comprador.</strong>
		<button type="button" class="close" data-dismiss="alert"
			aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
	</div>
	<!--   Core JS Files   -->
	<script src="../assets/js/core/jquery.min.js"></script>
	<script src="../assets/js/core/popper.min.js"></script>
	<script src="../assets/js/core/bootstrap.min.js"></script>
	<script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
	<!--  Google Maps Plugin    -->
	<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
	<!-- Chart JS -->
	<script src="../assets/js/plugins/chartjs.min.js"></script>
	<!--  Notifications Plugin    -->
	<script src="../assets/js/plugins/bootstrap-notify.js"></script>
	<!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
	<script src="../assets/js/paper-dashboard.min.js?v=2.0.0"
		type="text/javascript"></script>
	<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
	<script src="../assets/demo/demo.js"></script>
	<script>
		$(document).ready(function() {
			// Javascript method's body can be found in assets/assets-for-demo/js/demo.js
			demo.initChartsPages();
		});
	</script>

</body>
</html>