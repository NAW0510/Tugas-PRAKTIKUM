package UTP.Shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

 
    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    public double getTinggiSegitiga() {
        return Math.sqrt((getTinggi() * getTinggi()) + (sisi / 2) * (sisi / 2));
    }

 
    public double getLuasSegitiga() {
        return (getTinggiSegitiga() * sisi) / 2;
    }

  
    public double getLuasAlas() {
        return sisi * sisi;
    }


    @Override
    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi() / 3;
    }
}
