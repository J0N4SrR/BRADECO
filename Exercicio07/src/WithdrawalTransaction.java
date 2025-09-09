public class WithdrawalTransaction extends Transaction {
    private final WithdrawalUI ui;
    private double saldo;

    public WithdrawalTransaction(WithdrawalUI ui, double saldo) {
        this.ui = ui;
        this.saldo = saldo;
    }

    @Override
    public void execute() {
        double amount = ui.requestWithdrawalAmount();
        if (amount > saldo) {
            ui.informInsufficientFunds();
        } else {
            saldo -= amount;
            System.out.println("Sacando: " + amount);
        }
    }
}
