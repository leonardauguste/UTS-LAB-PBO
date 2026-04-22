package jawaban1;

import java.text.NumberFormat;
import java.util.Locale;

public class Karyawan {
    String id;
    String nama;
    String posisi;
    double gaji;

    // Constructor buat karyawan baru
    public Karyawan(String id, String nama, String posisi, double gaji) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    // Method untuk mengubah posisi karyawan
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    // Method untuk ngubah gaji karyawan
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Method untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        formatRupiah.setMaximumFractionDigits(0);

        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji: " + formatRupiah.format(gaji));
        System.out.println("----------------------");
    }
}