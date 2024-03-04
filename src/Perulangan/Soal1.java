/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B

Soal 1 Perulangan :
Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
periksa apakah masukan adalah ribuan.
*/

package Perulangan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tiga angka:");
        
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            if (num >= 1000) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("Angka-angka tersebut adalah ribuan.");
        } else {
            System.out.println("Angka-angka tersebut bukan ribuan.");
        }
        
        scanner.close();
    }
}
