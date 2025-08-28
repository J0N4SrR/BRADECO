package rosa.ribeiro.jonas.main;

import rosa.ribeiro.jonas.facade.EmployeeFacade;
import rosa.ribeiro.jonas.model.Employee;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee funcionario01 = new Employee("John", "Gerente de Projeto", 9500.0);
        Employee funcionario02 = new Employee("Layana G.", "Biomedico", 5000.0);
        Employee funcionario03 = new Employee("Fernanda C.", "Quimica", 7000.0);

        System.out.println("--- Solicitando o salvamento dos funcionários... ---");
        employeeFacade.saveEmployee(funcionario01);
        employeeFacade.saveEmployee(funcionario02);
        employeeFacade.saveEmployee(funcionario03);

        System.out.println("\n--- Operação concluída. ---");
        System.out.println("Salário calculado de " + funcionario01.getNome() + ": " + funcionario01.calculatePay());
        System.out.println("Salário calculado de " + funcionario02.getNome() + ": " + funcionario02.calculatePay());
        System.out.println("Salário calculado de " + funcionario03.getNome() + ": " + funcionario03.calculatePay());




    }
}