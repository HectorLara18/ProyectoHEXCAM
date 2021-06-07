package test;

import excepciones.OperacionExcepcion;
import static Security.PasswordError.tryToAutenticate;

public class TestPasswordError {
    public static void main(String[] args) {
        String myPassword = "ass12";
        tryToAutenticate(myPassword);

    }
}
