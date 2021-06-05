package test;

import domain.Desarrollo;

public class TestClaseDesarrollo {
    public static void main(String[] args) {
        Desarrollo desarrollador = new Desarrollo("Hector", 1000, "TI");
        desarrollador.setArea("Development");
        System.out.println(desarrollador);
    }
}
