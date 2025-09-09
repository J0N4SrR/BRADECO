package conta;

public class ContaBancaria extends Conta implements ContaComSaque {
    public ContaBancaria(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
