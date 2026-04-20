package com.example;

public class App {

    public static void main(String[] args) {

        Persona persona = new Persona("Alex Eduardo", 1.80, "Pilicita", "pili@gmail.com");

        Persona persona1 = Persona.builder()
                .correo("gomez@gmail.com"),
                .nombre("Duglas"),
                .build();


    }
}
