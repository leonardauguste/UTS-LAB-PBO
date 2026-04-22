package jawaban3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LotreBoard game = new LotreBoard();

        game.generateBoard();

        boolean jalan = true;

        while (jalan) {
            game.displayBoard();
            System.out.println("Silahkan masukkan pilihan kotak anda!");
            System.out.print("Masukkan baris (0-3): ");
            int row = input.nextInt();

            System.out.print("Masukkan kolom (0-4): ");
            int col = input.nextInt();

            // Validasi input
            if (row < 0 || row > 3 || col < 0 || col > 4) {
                System.out.println("Input tidak valid!");
                continue;
            }

            boolean aman = game.guess(row, col);

            if (!aman) {
                System.out.println("\nBOOM! Kena bom! Game over!!");
                game.displayBoard();
                break;
            }

            if (game.isGameOver()) {
                System.out.println("\nSelamat! Semua kotak aman berhasil dibuka!");
                game.displayBoard();
                break;
            }
        }
    }
}