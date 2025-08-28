package rosa.ribeiro.jonas.persistencia;

import rosa.ribeiro.jonas.model.Employee;

import java.io.*;

public class EmployeeRepository implements InterfaceEmployeeRepository {
    private int employeeNum;


    public EmployeeRepository() throws IOException {
        employeeNum = 0;
    }

    @Override
    public void store(Employee employee) throws IOException {
        employeeNum++;
        FileWriter fw = new FileWriter("banco.txt", true);
        PrintWriter pw = new PrintWriter(fw);

        pw.printf("\n- - - - - - - - - - Cliente nº: %d - - - - - - - - - -\n",employeeNum);
        pw.println("Nome: " + employee.getNome());
        pw.println("Cargo: " + employee.getCargo());
        pw.println("Salario: " + employee.calculatePay());
        pw.flush();
        pw.close();
    }
}
