<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

	<div class="container py-4">
	<div class="card bg-light">
		<div class="card-header">
			<h3 class="text-secondary">Consulta del cliente: Bar las acacias</h3>
		</div>
		<div class="card-body">
			<h4 class="card-title text-right"></h4>
			<ul class="list-group">
				<li class="list-group-item"><b>Tipo identificación: </b><span>${requestScope.cliente.tipoIdent}</span></li>
				<li class="list-group-item"><b>Identificación: </b><span>${requestScope.cliente.identificacion}</span></li>
				<li class="list-group-item"><b>Nombre: </b><span></span>${requestScope.cliente.nombre}</li>
				<li class="list-group-item"><b>Dirección: </b><span>${requestScope.cliente.direccion}</span></li>
				<li class="list-group-item"><b>telefono: </b><span>${requestScope.cliente.telefono}</span></li>
				<li class="list-group-item"><b>Correo: </b><span>${requestScope.cliente.correo}</span></li>
				<li class="list-group-item"><b>Fecha: </b><span>${requestScope.cliente.fecha}</span></li>
				<li class="list-group-item"><b>Cliente Activo: </b><span>${requestScope.cliente.clienteAct}</span></li>
				<li class="list-group-item"><b>Capacidad crédito: </b><span>${requestScope.cliente.capaciCredi}</span></li>
				<li class="list-group-item"><b>Categoria: </b><span>${requestScope.cliente.categoria}</span></li>
			</ul>
		</div>
	</div>
</div>
	 

</body>
</html>