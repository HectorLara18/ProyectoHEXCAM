package corporativeAccess;

import domain.Empleados;

public class HXCorp implements ICorporativeAccess {
    @Override
    public boolean serverAccess() {
        return false;
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
