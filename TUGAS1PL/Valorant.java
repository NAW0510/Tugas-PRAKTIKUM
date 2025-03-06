import java.util.Scanner;

public class Valorant {
        //mendeklarasikan object agent, yaitu jett dan phoenix

agent jett;
agent phoenix;
    //konstruktor valorant ini berfungsi untuk menginisialisasi agent jett dan phoenix

public Valorant(){
    //menginisialisasi agent jett dengan role, skill, dan HP nya
    jett = new agent("duelist", "dash", 100 );
    //menginisialisasi agent phoenix dengan role, skill, dan HP nya

    phoenix = new agent("duelist", "ressurection", 150 );

}
// main method
    public static void main(String[] args) {
        //mendeklarasikan variabel pilihan untuk input dari pilihan user
        int pilihan;
        //membuat object baru game untuk mengakses method pada kelas Valorant
        Valorant game = new Valorant();
        //membuat scanner untuk mendapatkan input dari user
        Scanner sc = new Scanner(System.in);
        
        //menampilkian pilihan menu pada user
        System.out.println("masukkan angka 1 untuk agent Jett, 2 untuk agent phoenix, 3 untuk keseluruhan agent");
        //mengambil dan menyimpan input user
        pilihan = sc.nextInt();
        //apabila user menginput 1 maka user memilih agnet jett
        if (pilihan == 1) {
            game.Jett();        }
        //apabila user menginput 2 maka user memilih agnet jett

        else if (pilihan ==2){
            game.Phoenix();
        }
        else if (pilihan ==3){
            game.all();
        }
        
    }
    public void Jett(){
        System.out.println("Agent 1 Jett" + "\n" + "role: " + jett.role + "\n" + "skill: "+ jett.skill + "\n" + "HP: "+ jett.HP);
    }
    public void Phoenix(){
        System.out.println("Agent 2 Phoenix" + "\n" + "role: " + phoenix.role + "\n" + "skill: "+ phoenix.skill + "\n" + "HP: "+ phoenix.HP);

    }
    public void all(){
        Jett();
        System.out.println("\n");
        Phoenix();
    }
    
    
}
