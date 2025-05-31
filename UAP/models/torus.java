package models; // Mendeklarasikan package models

import bases.shapes; // Mengimpor kelas abstrak shapes
import interfaces.pirequired; // Mengimpor interface PI
import interfaces.masscalculable; // Mengimpor interface massa
import interfaces.threedimensional; // Mengimpor interface 3D
import interfaces.massconverter; // Mengimpor interface konversi massa
import interfaces.shippingcostcalculator; // Mengimpor interface biaya kirim

/**
 * Kelas torus merepresentasikan bentuk donat (torus) dan menghitung
 * volume, luas permukaan, massa, konversi massa, serta biaya pengiriman.
 * Turunan dari shapes dan mengimplementasikan beberapa interface terkait.
 */
public class torus extends shapes implements threedimensional, pirequired, masscalculable, massconverter, shippingcostcalculator {
    private double majorRadius; // Jari-jari utama (jarak dari pusat ke tengah tabung)
    private double minorRadius; // Jari-jari minor (radius tabung)

    /**
     * Konstruktor untuk inisialisasi torus dengan major dan minor radius.
     * @param majorRadius jari-jari utama
     * @param minorRadius jari-jari minor
     */
    public torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius; // Set nilai majorRadius
        this.minorRadius = minorRadius; // Set nilai minorRadius
    }

    /**
     * Menghitung volume torus.
     * @return volume torus
     */
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius; // Rumus volume torus
    }

    /**
     * Menghitung luas permukaan torus.
     * @return luas permukaan torus
     */
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius; // Rumus luas permukaan torus
    }

    /**
     * Menghitung massa torus berdasarkan luas permukaan, ketebalan, dan densitas.
     * @return massa torus (gram)
     */
    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY; // Massa = luas permukaan x ketebalan x densitas
    }

    /**
     * Mengonversi massa dari gram ke kilogram.
     * @param grams massa dalam gram
     * @return massa dalam kilogram
     */
    @Override
    public double gramToKilogram(double grams) {
        return grams / DENOMINATOR; // Konversi gram ke kilogram
    }

    /**
     * Mengonversi massa torus langsung ke kilogram.
     * @return massa torus dalam kilogram
     */
    public double gramToKilogram() {
        return gramToKilogram(getMass()); // Konversi massa torus ke kilogram
    }

    /**
     * Menghitung biaya kirim berdasarkan massa dalam kg (dibulatkan ke atas).
     * @return biaya kirim
     */
    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // Biaya kirim = ceil(kg) x harga/kg
    }

    /**
     * Menampilkan seluruh informasi torus ke layar.
     */
    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f%n", getVolume()); // Tampilkan volume
        System.out.printf("Luas permukaan  : %.2f%n", getSurfaceArea()); // Tampilkan luas permukaan
        System.out.printf("Massa           : %.2f%n", getMass()); // Tampilkan massa (gram)
        System.out.printf("Massa dalam kg  : %.2f%n", gramToKilogram()); // Tampilkan massa (kg)
        System.out.printf("Biaya kirim     : Rp%.0f%n", calculateCost()); // Tampilkan biaya kirim
    }
}
