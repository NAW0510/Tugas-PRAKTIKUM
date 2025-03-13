package shapes;
import java.util.Scanner;
public class Circle {
    private int id;
    private double radius;
    private final double pembilang = 22;
    private final double penyebut = 7;

public Circle(){

}
public void id1(int id){
    this.id = id;
}
public void radius1(double radius){
    this.radius = radius;   }
public double getLuas(){
    return pembilang * radius * radius / penyebut;
}
public double getKll(){
    return 2 * pembilang * radius / penyebut;
}
public void total(){
    System.out.println("ID : " + id);
    System.out.println("Radius : " + radius);
    System.out.println("Keliling : " + getKll());
    System.out.println("Luas : " + getLuas());
    
}
}