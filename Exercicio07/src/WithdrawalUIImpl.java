public class WithdrawalUIImpl implements WithdrawalUI {
    @Override
    public double requestWithdrawalAmount() {
        return 200.0; 
    }

    @Override
    public void informInsufficientFunds() {
        System.out.println("Saldo insuficiente!");
    }
}