//alert ("Listo!!");

//Funciones con declaración 

// function mayor(num1, num2){
//     //Operador ternario if inline
//     // (exp_relacional) ? expr_si_verdadero : expr_si_falso;
    
//     return (num1 > num2) ? num1 : num2;
    
// }
// let mayor = function(num1, num2){
//     return (num1 > num2) ? num1 : num2;

// }

// Funciones felcha (arrow fuction) ... expresiones lamda
// Sintaxis: () => {}

// let mayor = (num1, num2) => (num1 > num2) ? num1 : num2;

// const x = 5;
// const y = 10;
// const z = -50;

// console.log (`el mayor entre ${x} , ${y} y ${z} es ${mayor(x, mayor(y,z))}`);

// const empleado = {
//     nombre: "Joe Hurtado Plata", 
//     edad: 45,
//     fechaIngreso: "2023/11/25",
//     salario: 6700000,
//     "zonas": ["Sur", "Occidente"],
//     activo: true,
//     direccion: {calle: 55, carrera: 40, numero: 121, barrio: "Candelaria"},
//     dependencia: "Ventas",
//     deduccion: function (porDed) {
//         return this.salario * (porDed / 100);
//     }
// };

// let pd = 10;

// // console.log(empleado.deduccion (pd));


// const factura = {
//     id: 1111,
//     descripcion: 'Compra papelería oficina',
//     cliente: { nombre: 'Oficina Desarrollo', correo: 'desarrollo@correo.org' },
//     items: [
//         {
//             producto: 'Resma papel',
//             precio: 13500,
//             cantidad: 20
//         },
//         {
//             producto: 'Caja lapicero negro',
//             precio: 25600,
//             cantidad: 6
//         },
//         {
//             producto: 'Libreta anotaciones media carta',
//             precio: 13450,
//             cantidad: 10
//         },                      
//     ],

//     //Item guarda el contenido de cada objeto de items
  
// // console.log(factura.Total());

// const valores = [25, -3, 720, -259, 37, 91];


    
// let tot = 0;
// valores.forEach((val) => {
//     tot += val;

// });

// // console.log(tot);

// let tot2 = valores.reduce((acum, val) => {
//     return acum + val;
// }, 0);

// // console.log(tot2);

// let valores2 = valores.map (val => val * 2);
// // console.log(valores2);

// // let rta1 = confirm ("Estas seguro?");
// // console.log(rta1);

// // let rt2 = prompt("Su nombre: ", "N.N");

// const returnObj = function(x,y) {
//     return{suma: x+y, resta: x-y, producto: x*y, division:(y==0 ? 'Error: Div0': x/y)};

// }

// // let res = returnObj(5,6);
// // console.log(res);

// Total: function(){
//     let tot = 0;
//     for(let item of this.items) {
//         tot += item.cantidad * item.precio;
//     }
//     return tot;
// }
// }



let asig = [
    {nom: 'Matemáticas', nota: 4.5},
    {nom: 'Algoritmos', nota: 4.8},
    {nom: 'Humanidades', nota: 2.3},
    {nom: 'Idiomas', nota: 4.0},
    {nom: 'Lenguaje Prog.', nota: 4.7},
];

//Crear una funcion que calcule y muestre el promedio de las calificaciones del promdio asig

const promedio = function () {
    let sum = 0;
    // let prom = 0;
    // let nota = 0; 

    for(let asignatura of asig)

         sum += asignatura.nota;
}
    return sum/asig.length

    console.log(promedio());

    const notaMasAlta = function () {
        let notaAlta = asig [0];
        for (let i = 1; i <asig.length; i++ ){
            if (asig[i].nota > notaMasAlta.nota) {
                notaAlta = asig [i];
            }
        }
        return notaAlta;
    }

    //console.log(notaMasAlta())

    let ventas = [
        {"codigo": '7', "vendedor": 'Ana', "venta": 2768280},
        {"codigo": '7', "vendedor": 'Ana', "venta": 1087660},
        {"codigo": '2', "vendedor": 'María', "venta": 2040850},
        {"codigo": '3', "vendedor": 'Olga', "venta": 1838380},
        {"codigo": '2', "vendedor": 'María', "venta": 1466250},
        {"codigo": '1', "vendedor": 'Juan', "venta": 632570},
        {"codigo": '2', "vendedor": 'María', "venta": 1290130},
        {"codigo": '1', "vendedor": 'Juan', "venta": 1873400},
        {"codigo": '7', "vendedor": 'Ana', "venta": 1080520},
        {"codigo": '7', "vendedor": 'Ana', "venta": 2179230},
        {"codigo": '6', "vendedor": 'Jose', "venta": 2564280},
        {"codigo": '3', "vendedor": 'Olga', "venta": 1923720},
        {"codigo": '5', "vendedor": 'Luis', "venta": 1944970},
        {"codigo": '2', "vendedor": 'María', "venta": 852210},
        {"codigo": '6', "vendedor": 'Jose', "venta": 470390},
        {"codigo": '7', "vendedor": 'Ana', "venta": 2712690},
        {"codigo": '3', "vendedor": 'Olga', "venta": 2592330},
        {"codigo": '5', "vendedor": 'Luis', "venta": 1921340},
        {"codigo": '6', "vendedor": 'Jose', "venta": 636480},
        {"codigo": '4', "vendedor": 'Pedro', "venta": 1136280},
        {"codigo": '1', "vendedor": 'Juan', "venta": 539580},
        {"codigo": '6', "vendedor": 'Jose', "venta": 2114630},
        {"codigo": '2', "vendedor": 'María', "venta": 2738700},
        {"codigo": '2', "vendedor": 'María', "venta": 1474070},
        {"codigo": '6', "vendedor": 'Jose', "venta": 2529260},
        {"codigo": '4', "vendedor": 'Pedro', "venta": 553180},
        {"codigo": '7', "vendedor": 'Ana', "venta": 1848750}
    ];
     

    //Elaborar una funcion que permita mostrar la valoracion del inventario por categoria(sumar almacenamiento) (sumar audio) (sumar video ) meterlos en un array 


    // Se pide al usuario el codigo de un vendedor por teclado. ese codigo de vendedor sera pasado a una funcion que calcule el total de ventas
    //para ese vendedor, debe retornar un objeto con el codigo del vendedor el nombre del vendedor y el total de ventas.

    let = totalVentas prompt ('codigo del vendedor:',1)

    let total = totalVentas {
        
    }
    for(let cod of ventas){
        codigo 
    }


    