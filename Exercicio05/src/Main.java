import conta.ContaBancaria;
import conta.ContaPoupanca;
import pagamento.Pagamentos;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000);
        Pagamentos.pagarConta(conta1, 200);

        ContaPoupanca conta2 = new ContaPoupanca(1000);
        // pagamento.Pagamentos.pagarConta(conta2, 200); // Agora não compila, respeitando LSP

        System.out.println("Saldo da poupança: " + conta2.getSaldo());
    }
}


/*Explique por que o código ao lado
viola o Princípio da Substituição
de Liskov.
 
O Princípio da Substituição de Liskov (LSP), proposto por Barbara Liskov, afirma que objetos de uma classe base devem poder ser substituídos por objetos de suas subclasses sem alterar o funcionamento correto do programa.

-conta.ContaBancaria permite saques.

-conta.ContaPoupanca é uma subclasse de conta.ContaBancaria, mas não permite saques, lançando UnsupportedOperationException.

-Assim, quando pagamento.Pagamentos.pagarConta recebe uma conta.ContaPoupanca, o código cliente falha, porque espera que toda conta.ContaBancaria aceite saque. Isso viola o LSP, porque conta.ContaPoupanca não pode ser usada no lugar de conta.ContaBancaria

*/


