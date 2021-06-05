package test;

import domain.Empleados;

public class TestClaseEmpleado {
    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Hector Lara", 100, "TI");
        Empleados empleado2 = new Empleados("Humberto Lara", 50, "TI");
        System.out.println(empleado1);
        System.out.println(empleado2);;
    }
}
