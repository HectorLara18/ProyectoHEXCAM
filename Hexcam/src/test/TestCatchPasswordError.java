package test;

import excepciones.OperacionExcepcion;

import static Security.Password.passwordLength;

public class TestCatchPasswordError {
    public static void main(String[] args) {
        String myPass = "mypass123";
        try {
            System.out.println(passwordLength(myPass));
        }catch (OperacionExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
