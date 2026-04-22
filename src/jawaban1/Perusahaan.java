package jawaban1;

import java.util.ArrayList;

public class Perusahaan {
    // List untuk menyimpan semua karyawan
    ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    // Tambah
    public void tambahKaryawan(Karyawan karyawan) {
        for (Karyawan k : daftarKaryawan) {
            if (k.id.equals(karyawan.id)) {
                System.out.println("ID sudah ada!");
                return;
            }
        }
        daftarKaryawan.add(karyawan);
        System.out.println("Karyawan berhasil ditambahkan.");
    }

    // Hapus
    public void hapusKaryawan(String id) {
        for (Karyawan k : daftarKaryawan) {
            if (k.id.equals(id)) {
                daftarKaryawan.remove(k);
                System.out.println("Karyawan berhasil dihapus.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan!");
    }

    // Update posisi
    public void ubahPosisi(String id, String posisiBaru) {
        for (Karyawan k : daftarKaryawan) {
            if (k.id.equals(id)) {
                k.setPosisi(posisiBaru);
                System.out.println("Posisi berhasil diubah.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan!");
    }

    // Update gaji
    public void ubahGaji(String id, double gajiBaru) {
        if (gajiBaru < 0) {
            System.out.println("Gaji tidak boleh negatif!");
            return;
        }

        for (Karyawan k : daftarKaryawan) {
            if (k.id.equals(id)) {
                k.setGaji(gajiBaru);
                System.out.println("Gaji berhasil diubah.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan!");
    }

    // Tampilkan semua
    public void tampilkanSemua() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
            return;
        }

        for (Karyawan k : daftarKaryawan) {
            k.tampilkanInfo();
        }
    }
}