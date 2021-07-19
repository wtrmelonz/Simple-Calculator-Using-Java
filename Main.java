package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Todo Simple calculator using Switch and Ternary Operator

        // Using Switch
        float a,b,hasil;
        String operator;
        Scanner inputUser;

        inputUser = new Scanner(System.in);
//        System.out.print("Nilai 1 : ");
//        a = inputUser.nextInt();
//        System.out.print("Operator : ");
//        operator = inputUser.next();
//        System.out.print("Nilai 2 : ");
//        b = inputUser.nextInt();
//
//        switch (operator){
//            case "+":
//                hasil = a + b;
//                System.out.print("= " + hasil +"\n");
//                break;
//            case "-":
//                hasil = a - b;
//                System.out.print("= " + hasil +"\n");
//                break;
//            case "*":
//                hasil = a * b;
//                System.out.print("= " + hasil +"\n");
//                break;
//            case "/":
//                hasil = a / b;
//                System.out.print("= " + hasil +"\n");
//                break;
//            default:
//                System.out.print("Operator " + operator + " tidak ditemukan\n");
//        }

        // Using Ternary Operator
        System.out.println("\n==== NEXT ====");

        System.out.print("a = ");
        a = inputUser.nextInt();
        System.out.print("operator: ");
        operator = inputUser.next();
        System.out.print("b = ");
        b = inputUser.nextInt();

        a = (operator.equals("+")) ? (a + b) : (0);
            System.out.println("Hasil = " + a);
            b = (operator.equals("-")) ? (a - b) : (0);
                System.out.println("hasil = " + b);
                int c = (operator.equals("*")) ? (a * c) : 
                        ()
    }
}