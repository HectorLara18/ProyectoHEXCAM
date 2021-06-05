package test;

import domain.Desarrollo;
import domain.Empleados;

public class TestInterface {
    public static void main(String[] args) {
        Desarrollo empleado1 = new Desarrollo("Hector Lara", 1500, "RRHH");
        empleado1.setArea("DEVOPS");
        System.out.println(empleado1.serverAccess());
    }
}
