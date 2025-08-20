public class AccountTest {
    public static void main(String[] args) {
        // Buat objek rekening pertama
        SavingsAccount sa1 = new SavingsAccount();
        sa1.name = "Damien";
        sa1.balance = 1000;
        sa1.interestRate = 0.02; // 2%

        // Buat objek rekening kedua
        SavingsAccount sa2 = new SavingsAccount();
        sa2.name = "Bill";
        sa2.balance = 2000;
        sa2.interestRate = 0.015; // 1.5%

        // Tes method
        sa1.displayCustomer();
        sa1.deposit(500);
        sa1.withdraw(200);
        sa1.addMonthlyInterest();
        sa1.displayCustomer();

        System.out.println("-------------------------");

        sa2.displayCustomer();
        sa2.deposit(1000);
        sa2.withdraw(3000); // coba tarik lebih besar dari saldo
        sa2.addMonthlyInterest();
        sa2.displayCustomer();
    }
}
