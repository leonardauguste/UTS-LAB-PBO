package jawaban1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner untuk input user
        Perusahaan perusahaan = new Perusahaan(); // Membuat objek perusahaan

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi");
            System.out.println("4. Ubah Gaji");
            System.out.println("5. Tampilkan Semua");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilihan) {
                case 1:
                    System.out.print("ID: ");
                    String id = input.nextLine();

                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Posisi: ");
                    String posisi = input.nextLine();

                    System.out.print("Gaji: ");
                    double gaji = input.nextDouble();

                    if (gaji < 0) {
                        System.out.println("Gaji tidak boleh negatif!");
                        break;
                    }

                    Karyawan k = new Karyawan(id, nama, posisi, gaji);
                    perusahaan.tambahKaryawan(k);
                    break;

                case 2:
                    System.out.print("Masukkan ID: ");
                    String idHapus = input.nextLine();
                    perusahaan.hapusKaryawan(idHapus);
                    break;

                case 3:
                    System.out.print("Masukkan ID: ");
                    String idPosisi = input.nextLine();

                    System.out.print("Posisi baru: ");
                    String posisiBaru = input.nextLine();

                    perusahaan.ubahPosisi(idPosisi, posisiBaru);
                    break;

                case 4:
                    System.out.print("Masukkan ID: ");
                    String idGaji = input.nextLine();

                    System.out.print("Gaji baru: ");
                    double gajiBaru = input.nextDouble();

                    perusahaan.ubahGaji(idGaji, gajiBaru);
                    break;

                case 5:
                    perusahaan.tampilkanSemua();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}