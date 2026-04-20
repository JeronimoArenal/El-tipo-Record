package com.example;

/*
//El record no es un mero atajo para crear una clase que permita crear objetos inmutables,
//es decir, que una vez creados no se pueden modificar. Es la mejor opcion para transportar datos.
//Genera una estructira de datos que es final y no se pueden hetredar.
//Las propiedades o campos se convoerten en private final, por lo que no generan setter para cambiar el valor.
//Se generan los metodos toString Equals y HasCode.
Un record no necesita Lombok, pero utilizar @Builder, nos facilita el trabajo. Porque no estariamos 
obligados a suministrar todos los parametros ni tendriamos que respetar el orden
 */

public record Persona(String nombre, double altura, 
                      String apellido1, String correo) {

}
