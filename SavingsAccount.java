public class SavingsAccount {
    // Properti
    public String name;
    public double balance;
    public double interestRate;

    // Tampilkan data nasabah
    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }

    // Tambah saldo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil: +" + amount);
        } else {
            System.out.println("Jumlah deposit harus positif!");
        }
    }

    // Tarik saldo (Latihan 3)
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Jumlah penarikan tidak boleh negatif!");
        } else if (amount > balance) {
            System.out.println("Saldo tidak mencukupi untuk penarikan!");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil: -" + amount);
            System.out.println("Saldo baru: " + balance);
        }
    }

    // Hitung bunga bulanan
    public double calcInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }

    // Tambahkan bunga ke saldo
    public void addMonthlyInterest() {
        double interest = calcInterest();
        balance += interest;
        System.out.println("Bunga ditambahkan: " + interest);
    }
}

