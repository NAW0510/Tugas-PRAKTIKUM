package TugasLC.Tugas2;

public class BankAccount {
  
        String noRek, namaPemiliki;
        double saldo;
    public BankAccount(String noRek, String namaPemiliki, double saldo){
        this.noRek = noRek;
        this.namaPemiliki = namaPemiliki;
        this.saldo = saldo;
    }
    public BankAccount(String noRek, String namaPemiliki){
        this.noRek = noRek;
        this.namaPemiliki = namaPemiliki;
        this.saldo = 0;
    }
    public void displayInfo(){
        System.out.println("Nomor Rekening: "+ noRek);
        System.out.println("Nama Pemilik: "+ namaPemiliki);
        System.out.println("Saldo: "+ saldo);
    }
    public void deposit(double amount){
        if (amount > 0) {
            saldo += amount;
            System.out.println("Berhasil melakukan deposit sebesar "+ amount);
        } else {
            System.out.println("Deposit harus lebih besar daripada "+ amount);
            
        }
        
    }
    public void withdraw(double amount){
        if (saldo >= amount && amount >0) {
            saldo -= amount;
            System.out.println("Berhasil melakukan withdraw sebesar "+ amount);
        } else if (amount <=0) {
            System.out.println("Withdraw harus lebih besar daripada "+ amount);
        }
        else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
