public class PayBillUIImpl implements PayBillUI {
    @Override
    public double requestBillAmount() {
        return 150.0;
    }

    @Override
    public void confirmPayment() {
        System.out.println("Pagamento confirmado.");
    }
}