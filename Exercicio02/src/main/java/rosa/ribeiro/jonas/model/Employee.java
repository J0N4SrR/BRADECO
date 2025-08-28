package rosa.ribeiro.jonas.model;

public class Employee {
    private String nome;
    private String cargo;
    private double salario;

    public Employee(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;

    }

    public double calculatePay() {
        return (salario * (1 + 0.05));
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }




}
