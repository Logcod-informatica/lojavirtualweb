<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="./assets/img/apple-icon.png">
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

<body class="">
	<div class="wrapper ">
		<div class="sidebar" data-color="white" data-active-color="danger">
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text logo-mini">
					<div class="logo-image-small">
						<img src="./assets/img/logo-small.png">
					</div>
				</a> <a href="http://www.creative-tim.com"
					class="simple-text logo-normal"> Loja de Jogos <!-- <div class="logo-image-big">
            <img src="../assets/img/logo-big.png">
          </div> -->
				</a>
			</div>
			<div class="sidebar-wrapper">
				<ul class="nav">
					<li class="active "><a target="ifrm"
						href="Controller?operacao=ItensLojaVirtual&acao=jogo"> <i
							class="nc-icon nc-bank"></i>
							<p>Loja de milhar</p>
					</a></li>
					<li><a href="AuthenticationUsuario" target="ifrm"> <i
							class="nc-icon nc-badge"></i>
							<p>Cadastro</p>
					</a></li>
					<li><a target="ifrm"
						href="Controller?operacao=LojaVirtual&acao=jogo"> <i
							class="nc-icon nc-cart-simple"></i>
							<p>Carrinho</p>
					</a></li>

					<li><a href="./user.html"> <i class="nc-icon nc-single-02"></i>
							<p>Login</p>
					</a></li>
					<li><a href="Controller?operacao=ViewPessoas&acao=pessoa">
							<i class="nc-icon nc-zoom-split"></i>
							<p>Consultas</p>
					</a></li>
					<li><a href="./typography.html"> <i
							class="nc-icon nc-caps-small"></i>
							<p>Typography</p>
					</a></li>
					<li class="active-pro"><a href="./upgrade.html"> <i
							class="nc-icon nc-spaceship"></i>
							<p>Upgrade to PRO</p>
					</a></li>
				</ul>
			</div>
		</div>
		<div class="main-panel">
			<!-- Navbar -->
			<nav
				class="navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent">
				<div class="container-fluid">
					<div class="navbar-wrapper">
						<div class="navbar-toggle">
							<button type="button" class="navbar-toggler">
								<span class="navbar-toggler-bar bar1"></span> <span
									class="navbar-toggler-bar bar2"></span> <span
									class="navbar-toggler-bar bar3"></span>
							</button>
						</div>
					
						<a class="navbar-brand" href="#pablo"><c:out value="Painel de informações"/></a>
					</div>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navigation" aria-controls="navigation-index"
						aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-bar navbar-kebab"></span> <span
							class="navbar-toggler-bar navbar-kebab"></span> <span
							class="navbar-toggler-bar navbar-kebab"></span>
					</button>

					<div class="collapse navbar-collapse justify-content-end"
						id="navigation">
						<form action="Controller" target="ifrm">
							<div class="input-group no-border">
								<input type="text" name="filtro" class="form-control"
									placeholder="buscar numero favorito">
								<div class="input-group-append">
									<div class="input-group-text">
										<i class="nc-icon nc-zoom-split"></i>
									</div>
									<input type="hidden" value="ItensLojaVirtual" name="operacao" />
									<input type="hidden" value="jogo" name="acao" />
								</div>
							</div>
						</form>
						<ul class="navbar-nav">
							<li class="nav-item"><a class="nav-link btn-magnify"
								href="#pablo"> <i class="nc-icon nc-layout-11"></i>
									<p>
										<span class="d-lg-none d-md-block">Stats</span>
									</p>
							</a></li>

							<li class="nav-item"><a class="nav-link btn-rotate"
								href="#pablo"> <i class="nc-icon nc-settings-gear-65"></i>
									<p>
										<span class="d-lg-none d-md-block">Conta</span>
									</p>
							</a></li>
						</ul>
					</div>
				</div>
			</nav>


			<div class="content">
				<iframe name="ifrm" class="border none"
					style="width: 100%; height: 400pt;"></iframe>
			</div>
		</div>
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