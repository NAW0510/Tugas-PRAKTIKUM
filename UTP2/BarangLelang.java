package UTP.UTP2;



public class BarangLelang {
    protected String namaBarang;
    protected double hargaAwal;
    protected double penawaranTertinggi = 0;
    protected Peserta pemenang = null;
    protected boolean statusLelang = false;

    public BarangLelang(String namaBarang, double hargaAwal) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
    }

    protected String formatRupiah(double amount) {
        long value = (long) amount;
        String str = Long.toString(value);
        StringBuilder sb = new StringBuilder();

        int len = str.length();
        int counter = 0;

        for (int i = len - 1; i >= 0; i--) {
            sb.insert(0, str.charAt(i));
            counter++;
            if (counter == 3 && i != 0) {
                sb.insert(0, '.');
                counter = 0;
            }
        }

        return "Rp" + sb.toString();
    }

    public void mulaiLelang() {
            System.out.println("Lelang untuk " + namaBarang + " telah dimulai dengan harga awal " + formatRupiah(hargaAwal));
    }

    public void terimaPenawaran(Peserta peserta, double jumlah) {
        if (!statusLelang) {
            System.out.println(peserta.getNama() + " menawar " + formatRupiah(jumlah));
            System.out.println("Penawaran tidak valid! Lelang sudah ditutup");
            return;
        }

        System.out.println(peserta.getNama() + " menawar " + formatRupiah(jumlah));

        if (jumlah <= penawaranTertinggi || jumlah <= hargaAwal) {
            double batas = Math.max(penawaranTertinggi, hargaAwal);
            System.out.println("Penawaran tidak valid! penawaran harus lebih tinggi dari " + formatRupiah(batas));
        } else if (peserta.getSaldo() < jumlah) {
            System.out.println("Penawaran tidak valid! Saldo " + peserta.getNama() + " tidak mencukupi");
        } else {
            penawaranTertinggi = jumlah;
            pemenang = peserta;
            System.out.println("Penawaran disetujui!");
        }
    }

    public void tutupLelang() {
        statusLelang = false;
        if (pemenang != null) {
            pemenang.setSaldo(pemenang.getSaldo() - penawaranTertinggi);
            System.out.println("Lelang ditutup! " + namaBarang + " terjual dengan harga " + formatRupiah(penawaranTertinggi) + " kepada " + pemenang.getNama());
            System.out.println("Sisa saldo " + pemenang.getNama() + ": " + formatRupiah(pemenang.getSaldo()));
        }
    }

    public void bukaLelang() {
        statusLelang = true;
    }
}
