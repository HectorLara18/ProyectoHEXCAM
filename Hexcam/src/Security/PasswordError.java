package Security;

import excepciones.OperacionExcepcion;

public class PasswordError {

    public static void tryToAutenticate(String password){
        try{
            imprimeErrorPassword(password);
        }catch (OperacionExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodos
    public static boolean imprimeErrorPassword(String password) throws OperacionExcepcion {
        boolean isPasswordValid = false;
        if(password.length() < 10){
            isPasswordValid = false;
            throw new OperacionExcepcion("Password is too short");
        } else {
            isPasswordValid = true;
        } return isPasswordValid;
    }
}
