package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){
        // todo Membuat program kalkulator sederhana
        float a,b,hasil;
        char operator;
        Scanner inputAngka = new Scanner(System.in);

        System.out.print("Angka a = ");
        a = inputAngka.nextFloat();
        System.out.print("operator: ");
        operator = inputAngka.next().charAt(0);
        System.out.print("Angka b = ");
        b = inputAngka.nextFloat();

        // todo menambahkan kondisi if-else
        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.print("Hasilnya = " + hasil);
        }
        else if (operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.print("Hasilnya = " + hasil);
        }
        else if (operator == '*'){
            // perkalian
            hasil = a * b;
            System.out.print("Hasilnya = " + hasil);
        }
        else if (operator == '/'){
            // pembagian
            hasil = a / b;
            if (b == 0){
               System.out.print("Hasil pembagi nol akan menghasilkan nilai tak hingga");
           }
            else {
                System.out.println("Hasil " + hasil);
            }
        }
        else {
            System.out.println("Operator tidak ditemukan");
        }


    }
}
