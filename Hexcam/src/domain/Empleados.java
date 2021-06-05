package domain;

import corporativeAccess.ICorporativeAccess;

import java.io.Serializable;

public class Empleados implements Serializable {
    //Atributos
    protected String nombre;
    protected double sueldo;
    protected String department;
    protected int empId;
    private static int id;

    static {
        ++Empleados.id;
    }

    {
        this.empId = Empleados.id++;
    }

    //Constructor
    public Empleados(){};

    public Empleados(String nombre, double sueldo, String department){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.department = department;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", department='" + department + '\'' +
                ", empId=" + empId +
                '}';
    }
}
