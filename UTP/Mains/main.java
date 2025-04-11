/*
  I Gusti Ngurah Anantawijaya Mahardika - 245150700111027


#     #  #####  #     # ######     #    #     # 
##    # #     # #     # #     #   # #   #     # 
# #   # #       #     # #     #  #   #  #     # 
#  #  # #  #### #     # ######  #     # ####### 
#   # # #     # #     # #   #   ####### #     # 
#    ## #     # #     # #    #  #     # #     # 
#     #  #####   #####  #     # #     # #     # 

*/

package UTP.Mains;

import UTP.Shapes.PrismaSegitigaSamaKaki;
import UTP.Shapes.LimasPersegi;
import UTP.Shapes.Tabung;

import java.util.Scanner;

public class main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(WHITE + "===============================================" + RESET);
        System.out.println(RED + "Kalkulator Bangun Ruang" + RESET);
        System.out.println(RED + "I Gusti Ngurah Anantawijaya Mahardika" + RESET);
        System.out.println(RED + "245150700111027" + RESET);
        System.out.println(WHITE + "===============================================" + RESET);

        System.out.println(RED + "Prisma Segitiga Sama Kaki" + RESET);
        System.out.println(WHITE + "===============================================" + RESET);
        System.out.print("Isikan " + RED + "alas" + RESET + "     : ");
        double alas = input.nextDouble();
        System.out.print("Isikan " + RED + "kaki" + RESET + "     : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan " + RED + "tinggi" + RESET + "   : ");
        double tinggiPrisma = input.nextDouble();

        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);

        System.out.println(WHITE + "===============================================" + RESET);
        System.out.println("Nama            : " + RED + prisma.getNama() + RESET);
        System.out.printf("Luas permukaan  : " + RED + "%.2f\n" + RESET, prisma.getLuasPermukaan());
        System.out.printf("Volume          : " + RED + "%.2f\n" + RESET, prisma.getVolume());
        System.out.println(WHITE + "===============================================" + RESET);

        System.out.println(RED + "Limas Persegi" + RESET);
        System.out.println(WHITE + "===============================================" + RESET);
        System.out.print("Isikan " + RED + "sisi" + RESET + "     : ");
        double sisi = input.nextDouble();
        System.out.print("Isikan " + RED + "tinggi" + RESET + "   : ");
        double tinggiLimas = input.nextDouble();

        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);

        System.out.println(WHITE + "===============================================" + RESET);
        System.out.println("Nama            : " + RED + limas.getNama() + RESET);
        System.out.printf("Luas permukaan  : " + RED + "%.2f\n" + RESET, limas.getLuasPermukaan());
        System.out.printf("Volume          : " + RED + "%.2f\n" + RESET, limas.getVolume());
        System.out.println(WHITE + "===============================================" + RESET);

        System.out.println(RED + "Tabung" + RESET);
        System.out.println(WHITE + "===============================================" + RESET);
        System.out.print("Isikan " + RED + "radius" + RESET + "   : ");
        double radius = input.nextDouble();
        System.out.print("Isikan " + RED + "tinggi" + RESET + "   : ");
        double tinggiTabung = input.nextDouble();

        Tabung tabung = new Tabung();
        tabung.setRadius(radius);
        tabung.setTinggi(tinggiTabung);

        System.out.println(WHITE + "===============================================" + RESET);
        System.out.println("Nama            : " + RED + tabung.getNama() + RESET);
        System.out.printf("Luas permukaan  : " + RED + "%.2f\n" + RESET, tabung.getLuasPermukaan());
        System.out.printf("Volume          : " + RED + "%.2f\n" + RESET, tabung.getVolume());
        System.out.println(WHITE + "===============================================" + RESET);

        input.close();
    }
}

