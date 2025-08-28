package rosa.ribeiro.jonas.persistencia;
import rosa.ribeiro.jonas.model.Employee;

import java.io.IOException;

public interface InterfaceEmployeeRepository {
    void store(Employee employee) throws IOException;
}
