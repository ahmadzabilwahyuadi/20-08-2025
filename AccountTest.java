public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa1 = new SavingsAccount();
        sa1.name = "Damien";
        sa1.balance = 1000;
        sa1.interestRate = 0.02;

        // Tes withdraw
        boolean success = sa1.withdraw(2000); // coba tarik lebih besar dari saldo
        if (!success) {
            System.out.println("Transaksi dibatalkan.\n");
        }

        sa1.withdraw(500); // berhasil
        sa1.displayCustomer();
    }
}
