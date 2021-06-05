package corporativeAccess;

import domain.Empleados;

public interface ICorporativeAccess {

    boolean serverAccess();

    boolean networkAccess();

    boolean infrastructureAccess();

}
