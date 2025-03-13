package TugasLC;
import TugasLC.Tugas2.BankAccount;

public class MAIN {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1234567890", "Mang EAK", 1000000);
        acc1.displayInfo();
        BankAccount acc2 = new BankAccount("0987654321", "James Bond");
        acc2.displayInfo();
        acc1.deposit(1000000);
        acc1.displayInfo();
        acc2.withdraw(1000000);
        acc2.displayInfo();
        acc1.withdraw(20000000);
        acc1.displayInfo();
        acc2.withdraw(20000000);
        acc2.withdraw(0);
        acc1.deposit(0);
    }
}
