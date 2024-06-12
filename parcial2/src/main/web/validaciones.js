//alert ("Integrado con Javascript");

function validar() {
	let validado = true;

	let msgs = document.querySelectorAll('small[id^="msg"]');
	for (let m of msgs) {
		m.innerHTML = "";
	}

	// 1. Obtener los controles del formulario, son objetos para Js 
	let tipoIdent = document.getElementById('tipoIdent');
	let identificacion = document.getElementById('identificacion');
	let nombre = document.getElementById('nombre');
	let direccion = document.getElementById('direccion');
	let telefono = document.getElementById('telefono');
	let correo = document.getElementById('correo');
	let fecha = document.getElementById('fecha');
	let capaciCredi = document.getElementById('capaciCredi');
	let radio = document.getElementsByName('radio');

	let msgtipoIdent = document.getElementById('msgtipoIdent');
	let msgidentificacion = document.getElementById('msgidentificacion');
	let msgnombre = document.getElementById('msgnombre');
	let msgdireccion = document.getElementById('msgdireccion');
	let msgtelefono = document.getElementById('msgtelefono');
	let msgcorreo = document.getElementById('msgcorreo');
	let msgfecha = document.getElementById('msgfecha');
	let msgcapaciCredi = document.getElementById('msgcapaciCredi');
	let msgcategoria = document.getElementById('msgcategoria');

	// 2. Si los controles son cajas de texto de texto/claves o areas de texto, incluir expresiones regulares - regex
	let rgxidentificacion = /^[0-9]{6,10}$/;
	let rgxnombre = /^[a-zA-Z-á-é-í-ó-úÁ-É-Í-Ó-Ú �]{4,50}$/;
	let rgxdireccion = /^[a-zA-Z0-9\s,#.-]{10,100}$/;

	let rgxtelefono = /^[0-9]{7,15}$/;
	let rgxcorreo =  /^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+(?:[a-zA-Z]{2}|aero|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel)$/;
	let rgxfecha = /^\d{4}-\d{2}-\d{2}$/; 
	let rgxCapaciCredi = /^-?\d+(\.\d+)?$/;

	// 4. Pre-validar las cajas de chequeo y los radio botones
	let esValidoRadio = false;
	for (let i = 0; i < radio.length; i++) {
		if (radio[i].checked) {
			esValidoRadio = true;
			break;
		}
	}

	// 4. Hacer las preguntas de validación
	if (tipoIdent.selectedIndex == 0) {
		msgtipoIdent.innerHTML += "Selecciona una opción!!<br/>";
		validado = false;
	}

	if (identificacion.value.trim() == "" || !rgxidentificacion.test(identificacion.value)) {
		msgidentificacion.innerHTML += "La identificación no es válida!!<br/>";
		validado = false;
	}

	if (!rgxnombre.test(nombre.value)) {
		msgnombre.innerHTML += "El nombre no es válido!!<br/>";
		validado = false;
	}

	if (!rgxdireccion.test(direccion.value)) {
		msgdireccion.innerHTML += "La dirección no es válida!!<br/>";
		validado = false;
	}

	if (!rgxtelefono.test(telefono.value)) {
		msgtelefono.innerHTML += "El teléfono no es válido!!<br/>";
		validado = false;
	}

	if (!rgxcorreo.test(correo.value)) {
		msgcorreo.innerHTML += "El correo no es válido!!<br/>";
		validado = false;
	}

	if (!rgxfecha.test(fecha.value)) {
		msgfecha.innerHTML += "La fecha no es válida (debe ser en formato yyyy-MM-dd)!!<br/>";
		validado = false;
	}

	if (!rgxCapaciCredi.test(capaciCredi.value)) {
		msgcapaciCredi.innerHTML += "La capacidad de crédito no es válida!!<br/>";
		validado = false;
	}

	if (!esValidoRadio) {
		msgcategoria.innerHTML += "Seleccionar una opción!!<br/>";
		validado = false;
	}

	return validado;
};
