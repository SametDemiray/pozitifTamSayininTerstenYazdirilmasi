package org.example;
/*
Bu program, kullanıcıdan bir tamsayı alır, bu tamsayının tersini hesaplar ve sonucu ekrana yazdırır.
Örneğin, kullanıcı 12345 gibi bir tamsayı girerse, program 54321'i hesaplar ve ekrana yazdırır.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int reversedNumber;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan pozitif bir tamsayı al
        System.out.print("Pozitif bir tamsayı girin: ");
        number = scanner.nextInt();

        // Tersini hesapla
        reversedNumber = reverseNumber(number);

        // Sonucu ekrana yazdır
        System.out.println("Ters tamsayı: " + reversedNumber);

        scanner.close();
    }

    // Tamsayının tersini hesapla
    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Son basamağı al
            reversedNumber = reversedNumber * 10 + digit; // Tersine çevir
            number /= 10; // Son basamağı sil
        }

        return reversedNumber;
    }

}