// alert('Ready..');

let x = 5.76;
//document .write("<b>valor de x: </b>" + x  ); // muestra en la pagina web
//console.log("Tipo de x:" + typeof x +" contenido = " + x );

if(true){
    let = 1000;
    //console.log(x);
}

//console.log(x);

let y = 10;
 y = 15;
//var es una variable global
 for (let i=1; i<= 5; i++ ){
    //console.log(i);
 }

//  console.log(i);

const z= "Zoe";

//const arr = ['Juan', 33];
//arr = [34, false];
//arr[0] = -56;
//arr.push(70);

const obj = {"nom": "pepe", "edad": 18};
obj.nom = "Juan";
obj.genero = "masculino";

let disponible = false;
let nombre = "Eva Lua";
let edad = 38;
//console.log(nombre + "tiene " + edad+ 'años.');

//console.log(`${nombre} tiene ${edad} años.`);

let p= 5 ** 2;
//console.log(Math.sqrt(p));
 
let n = null;
console.log(n);

const datos = ['Joe', 45, false , [23,49, 3.14]];
datos[10] = ['Rojo', 'Verde', 'Azul'];
datos.push("Empleado");
datos.unshift("Centro")

for (let i = 0; i < datos.length; i++){
    console.log(datos[i]);
}

//en el ciclo c(For ... of ... ) La variable i toma el contenido de cada uno de los elementos
// for  (let i of datos) {
//     console.log(i);
// }

//Quita elementos del final / Push añade elemento al final
let t  = datos.pop();
//Añade elementos al uinicio / unshift añade al final
let i = datos.shift()

// for ( let i in datos ) {
//     console.log(`[${i}] = ${datos[i]}` );
// 

const obj2 = new Object();
obj2.campo = "un dato";

const empleado = {
nombre: "Joe Hurtado Plata", 
edad: 45, 
fechaIngreso: "2023/11/25",
salario: 6700000,
zonas: ["sur", "Occidente"],
Activo: true,
direccion: {calle: 55, carrera: 40, numero: 121, barrio: "Candelaria"},
dependencia: "Ventas",

};

// console.log();

// for (let emp in empleado){
//     console.log(`[${emp}] = ${empleado[emp]}`)
// }


