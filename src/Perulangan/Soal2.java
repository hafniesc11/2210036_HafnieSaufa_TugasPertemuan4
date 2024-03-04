/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer B

Soal 2 Perulangan :
Buatlah algoritma dalam bahasa Java, menentukan sebuah bilangan prima atau
komposit melalui data inputan dari scanf dengan batasan inputan batasAwal >=1 dan
batasAkhir <=100
*/

package Perulangan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal : ");
        int batasAwal = scanner.nextInt();
        
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = scanner.nextInt();
        
        if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
            System.out.println("Input tidak valid.");
            return;
        }
        
        System.out.println("Bilangan prima di antara " + batasAwal + " sd " + batasAkhir + ":");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nBilangan komposit di antara " + batasAwal + " sd " + batasAkhir + ":");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    // Method untuk memeriksa apakah suatu bilangan prima atau bukan
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
