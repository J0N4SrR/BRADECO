package pagamento;

import conta.Conta;
import conta.ContaComSaque;

public class Pagamentos {
    public static void pagarConta(ContaComSaque conta, double valor) {
        if (conta instanceof Conta) {
            System.out.println("Saldo antes: " + ((Conta) conta).getSaldo());
        }
        conta.sacar(valor);
        if (conta instanceof Conta) {
            System.out.println("Saldo depois: " + ((Conta) conta).getSaldo());
        }
    }
}
