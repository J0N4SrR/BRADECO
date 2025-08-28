package rosa.ribeiro.jonas.facade;

import rosa.ribeiro.jonas.model.Employee;
import rosa.ribeiro.jonas.persistencia.InterfaceEmployeeRepository;
import rosa.ribeiro.jonas.persistencia.EmployeeRepository;

import java.io.IOException;

public class EmployeeFacade {
    private final InterfaceEmployeeRepository repository = new EmployeeRepository();

    public EmployeeFacade() throws IOException {
    }

    public void saveEmployee(Employee employee) throws IOException {
        repository.save(employee);
    }

}
