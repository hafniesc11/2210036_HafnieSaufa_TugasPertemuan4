/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B

Soal 3 Perulangan :
Buatlah algoritma dalam bahasa Java, menulis sebuah program yang akan mencetak
berbagai output sebagai berikut, tergantung nilai N yang dibaca. N dapat berharga
antara 1 s.d. 1000:
*/

package Perulangan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pola: ");
        int bintang = input.nextInt();

        if (bintang > 0 && bintang <= 1000) {
            for (int i = 1; i <= bintang; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.printf("Tidak ada hasil untuk nilai %d \n", bintang);
        }
        input.close();
    }
}

