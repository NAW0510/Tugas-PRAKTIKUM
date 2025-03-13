package geometry.Shapes;

public class Circle {
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    // Constructor without parameters
    public Circle() {
        this.id = 0;
        this.radius = 0.0;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter for Radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for Circumference
    public double getKeliling() {
        return (double) pembilang / penyebut * 2 * radius;
    }

    // Getter for Area
    public double getLuas() {
        return (double) pembilang / penyebut * radius * radius;
    }

    // Method to display circle description
    public void printDeskripsi() {
        System.out.println("=====================================");
        System.out.println("ID      : " + id);
        System.out.println("Radius  : " + radius);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas    : " + getLuas());
        System.out.println("=====================================");
    }
}