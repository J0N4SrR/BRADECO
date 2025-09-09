public class PayGasBillTransaction extends Transaction {
    private final PayBillUI ui;

    public PayGasBillTransaction(PayBillUI ui) {
        this.ui = ui;
    }

    @Override
    public void execute() {
        double amount = ui.requestBillAmount();
        System.out.println("Pagando conta de gás: " + amount);
        ui.confirmPayment();
    }
}
