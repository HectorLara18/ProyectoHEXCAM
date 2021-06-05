package test;

import enumeraciones.Areas;
import domain.Desarrollo;

public class TestEnumeracion {
    public static void main(String[] args) {
        Desarrollo programador = new Desarrollo("Hector", 1500, "TI");
        programador.setArea("DEVELOPMENT");
        System.out.println(area(programador));
    }
    public static String area(Desarrollo developer){
        String github;
        if(developer.getArea() == "DEVELOPMENT"){
            github =  Areas.DEVELOPMENT.getGitHUB();
        } else {
            github = "Area no disponible";
        }return github;
    }
}
