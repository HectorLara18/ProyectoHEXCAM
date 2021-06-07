package test;

import excepciones.OperacionExcepcion;

import static Security.Password.passwordLength;

//*
// prueba unitaria para la funcion de password*/

public class TestIsPasswordCorrect {
    public static void main(String[] args) throws OperacionExcepcion {
        String myPass = "myPass123";
        System.out.println(passwordLength(myPass));
    }
}
