package jawaban3;

import java.util.Random;

public class LotreBoard {
    char[][] board = new char[4][5];
    boolean[][] revealed = new boolean[4][5];
    int[][] data = new int[4][5]; // 0 = aman, 1 = bom

    int openedSafe = 0;

    // Generate papan + 2 bom acak
    public void generateBoard() {
        Random rand = new Random();

        int bomb = 0;
        while (bomb < 2) {
            int r = rand.nextInt(4);
            int c = rand.nextInt(5);

            if (data[r][c] == 0) {
                data[r][c] = 1;
                bomb++;
            }
        }
    }

    // Tampilkan papan
    public void displayBoard() {
        System.out.println("\nWelcome to Lotre Gosok ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (!revealed[i][j]) {
                    System.out.print("* ");
                } else {
                    if (data[i][j] == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }
                }
            }
            System.out.println();
        }
    }

    // Proses tebakan
    public boolean guess(int row, int col) {
        if (revealed[row][col]) {
            System.out.println("Kotak sudah dibuka! Masukkan kotak yang lain");
            return true;
        }

        revealed[row][col] = true;

        if (data[row][col] == 1) {
            return false; // kena bom
        } else {
            openedSafe++;
            return true;
        }
    }

    // Cek game over
    public boolean isGameOver() {
        return openedSafe == 18;
    }
}