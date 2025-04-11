package UTP.Shapes;

public class Tabung extends BangunRuang {
    private double radius; 
    private final int PEMBILANG = 22; 
    private final int PENYEBUT = 7; 

    public Tabung() {
        setNama("Tabung");
    }

    
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    
    public double getLuasAlas() {
        return PEMBILANG / (double) PENYEBUT * radius * radius;
    }

    
    public double getKeliling() {
        return 2 * PEMBILANG / (double) PENYEBUT * radius;
    }

    
    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    
    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
}