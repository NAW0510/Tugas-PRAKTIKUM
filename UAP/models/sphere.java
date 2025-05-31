package models; // Mendeklarasikan package models

import bases.shapes; // Mengimpor kelas abstrak shapes sebagai parent
import interfaces.pirequired; // Mengimpor interface untuk konstanta PI
import interfaces.masscalculable; // Mengimpor interface untuk perhitungan massa
import interfaces.threedimensional; // Mengimpor interface untuk bentuk 3D
import interfaces.massconverter; // Mengimpor interface untuk konversi massa
import interfaces.shippingcostcalculator; // Mengimpor interface untuk perhitungan biaya kirim

/**
 * Kelas sphere merepresentasikan bentuk bola dan menghitung
 * volume, luas permukaan, massa, konversi massa, serta biaya pengiriman.
 * Turunan dari shapes dan mengimplementasikan beberapa interface terkait.
 */
public class sphere extends shapes implements threedimensional, pirequired, masscalculable, massconverter, shippingcostcalculator {
    private double radius; // Menyimpan nilai jari-jari bola

    /**
     * Konstruktor untuk inisialisasi objek Sphere dengan radius tertentu
     * @param radius jari-jari bola
     */
    public sphere(double radius) {
        this.radius = radius; // Set nilai radius
    }

    /**
     * Menghitung volume bola
     * @return volume bola
     */
    @Override
    public double getVolume() {
        return (4.0 / 3) * PI * radius * radius * radius; // Rumus volume bola
    }

    /**
     * Menghitung luas permukaan bola
     * @return luas permukaan bola
     */
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius; // Rumus luas permukaan bola
    }

    /**
     * Menghitung massa bola (massa = volume x densitas)
     * @return massa bola dalam gram
     */
    @Override
    public double getMass() {
        return getVolume() * DENSITY; // Massa = volume x densitas
    }

    /**
     * Mengonversi massa dari gram ke kilogram (mengimplementasi interface massconverter)
     * @param grams massa dalam gram
     * @return massa dalam kilogram
     */
    @Override
    public double gramToKilogram(double grams) {
        return grams / DENOMINATOR; // Konversi gram ke kilogram
    }

    /**
     * Helper: Mengonversi massa bola langsung ke kilogram
     * @return massa bola dalam kilogram
     */
    public double gramToKilogram() {
        return gramToKilogram(getMass()); // Konversi massa bola ke kilogram
    }

    /**
     * Menghitung biaya kirim berdasarkan massa dalam kg (dibulatkan ke atas)
     * @return biaya kirim
     */
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // Biaya kirim = ceil(kg) x harga/kg
    }

    /**
     * Menampilkan seluruh informasi bola ke layar
     */
    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f%n", getVolume()); // Menampilkan volume
        System.out.printf("Luas permukaan  : %.2f%n", getSurfaceArea()); // Menampilkan luas permukaan
        System.out.printf("Massa           : %.2f%n", getMass()); // Menampilkan massa dalam gram
        System.out.printf("Massa dalam kg  : %.2f%n", gramToKilogram()); // Menampilkan massa dalam kg
        System.out.printf("Biaya kirim     : Rp%.0f%n", calculateCost()); // Menampilkan biaya kirim
    }
}
