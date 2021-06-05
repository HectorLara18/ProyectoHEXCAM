package domain;

import corporativeAccess.ICorporativeAccess;

import java.io.Serializable;

public class Desarrollo  extends Empleados implements Serializable, ICorporativeAccess {
    //Atriutos
    private String area;

    //Constructor
    public Desarrollo() {
        super();
    }

    public Desarrollo(String nombre, double sueldo, String department) {
        super(nombre, sueldo, department);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Desarrollo{" +
                "area='" + area + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", department='" + department + '\'' +
                ", empId=" + empId +
                '}';
    }

    //Metodos de Interfaces


    @Override
    public boolean serverAccess() {
        if(this.area == "DEVOPS"){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean networkAccess() {
        return false;
    }

    @Override
    public boolean infrastructureAccess() {
        return false;
    }
}

