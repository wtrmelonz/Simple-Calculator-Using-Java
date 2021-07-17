package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){
        // todo Membuat program kalkulator sederhana
        float a,b,result;
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
            result = a + b;
            System.out.print("Hasilnya = " + result);
        }
        else if (operator == '-'){
            // pengurangan
            result = a - b;
            System.out.print("Hasilnya = " + result);
        }
        else if (operator == '*'){
            // perkalian
            result = a * b;
            System.out.print("Hasilnya = " + result);
        }
        else if (operator == '/'){
            // pembagian
            result = a / b;
            if (b == 0){
               System.out.print("Hasil pembagi nol akan menghasilkan nilai tak hingga");
           }
            else {
                System.out.println("Hasil " + result);
            }
        }
        else {
            System.out.println("Operator has not found");
        }
    }
}
