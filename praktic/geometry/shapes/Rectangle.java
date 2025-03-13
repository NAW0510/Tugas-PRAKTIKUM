package shapes;

public class Rectangle {
    private int id;
    private double panjang;
    private double lebar;
    public Rectangle(int id, double panjang, double lebar){}
    public void id(int id){
        this.id = id;
    }
    public void panjang(double panjang){
        this.panjang = panjang;
    }
    public void lebar(double lebar){
        this.lebar = lebar;
    }
    public double getLuas(){
        return panjang * lebar;
    }   
    public double getKll(){
        return 2 * (panjang + lebar);
    }
    public void total(){
        System.out.println("ID : " + id);
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Keliling : " + getKll());
        System.out.println("Luas : " + getLuas());
    }
    
    

}


