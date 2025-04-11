package UTP.Shapes;

public abstract class BangunRuang {
    private String nama;
    private double tinggi; 

   
    public BangunRuang() {}


    public void setNama(String inputNama) {
        nama = inputNama;
    }

   
    public String getNama() {
        return nama;
    }


    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }

  
    public double getTinggi() {
        return tinggi;
    }


    public abstract double getLuasPermukaan();
    public abstract double getVolume();


    public void printInfo() {
        System.out.println("Nama Bangun Ruang: " + nama);
        System.out.println("Tinggi: " + tinggi);
    }
}