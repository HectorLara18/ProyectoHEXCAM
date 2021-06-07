package Security;

import excepciones.OperacionExcepcion;

public class Password {
    public static boolean passwordLength(String myPass) throws OperacionExcepcion{
        boolean isPasswordCorrect = false;
        if(myPass.length() > 10){
            isPasswordCorrect = true;
        } else {
            isPasswordCorrect = false;
            throw new OperacionExcepcion("password is too short");
        }return isPasswordCorrect;
    }
}
