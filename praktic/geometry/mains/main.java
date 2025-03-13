import java.util.Scanner;
public class main {
        
        static String green = "\u001B[32m";
        static void printGaris(){
            System.out.println("==================================");
        }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        shapes.Circle c1 = new shapes.Circle();
        shapes.Rectangle r1 = new shapes.Rectangle(0, 0, 0);
        System.out.println(green);
        printGaris();
        System.out.println("Nama: I Gusti Ngurah Anantawijaya Mahardika");
        System.out.println("NIM: 245150700111027");
        printGaris();
        System.out.println("Circle");
        printGaris();
        System.out.print("Masukkan ID : " );
        c1.id1(input.nextInt());
        System.out.print("Masukkan Radius : ");
        c1.radius1(input.nextDouble());
        printGaris();
        c1.total();
        printGaris();
        System.out.println("Rectangle");
        printGaris();
        System.out.print("Masukkan ID : ");
        r1.id(input.nextInt());
        System.out.print("Masukkan Panjang : ");
        r1.panjang(input.nextDouble());
        System.out.print("Masukkan Lebar : ");
        r1.lebar(input.nextDouble());
        printGaris();
        r1.total();
        printGaris();

    }
}
