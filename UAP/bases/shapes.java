package bases; // Mendeklarasikan package bases

/**
 * Kelas abstrak shapes sebagai dasar untuk semua bentuk.
 * Menyediakan atribut nama dan method dasar untuk bentuk.
 */
public abstract class shapes {
    protected String name; // Nama bentuk

    public shapes() {} // Konstruktor default

    /**
     * Mengatur nama bentuk.
     * @param inputName nama bentuk
     */
    public void setName(String inputName) { this.name = inputName; } // Setter nama

    /**
     * Mengambil nama bentuk.
     * @return nama bentuk
     */
    public String getName() { return name; } // Getter nama

    /**
     * Method abstrak untuk menampilkan info bentuk.
     */
    public abstract void printInfo(); // Method abstrak printInfo
}
