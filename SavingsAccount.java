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

    // Tarik saldo dengan validasi + return value
    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("❌ Penarikan gagal: jumlah tidak boleh negatif!");
            return false;
        } else if (amount > balance) {
            System.out.println("❌ Penarikan gagal: saldo tidak mencukupi!");
            return false;
        } else {
            balance -= amount;
            System.out.println("✅ Penarikan berhasil: -" + amount);
            System.out.println("Saldo baru: " + balance);
            return true;
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

