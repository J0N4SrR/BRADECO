public class Main {
    public static void main(String[] args) {

        Transaction deposit = new DepositTransaction(new DepositUIImpl());
        Transaction withdraw = new WithdrawalTransaction(new WithdrawalUIImpl(), 150);
        Transaction transfer = new TransferTransaction(new TransferUIImpl());
        Transaction payGasBill = new PayGasBillTransaction(new PayBillUIImpl());

        deposit.execute();
        withdraw.execute();
        transfer.execute();
        payGasBill.execute();
    }
}
