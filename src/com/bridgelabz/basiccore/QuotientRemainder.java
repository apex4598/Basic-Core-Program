package com.bridgelabz.basiccore;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println("ENTER NUMBER AND DIVISIOR");
        int num=q.nextInt();
        int div=q.nextInt();
        //check Quotient and Remainder
        int Quotient=num/div;
        System.out.println("Quotient is "+Quotient);
        int Remainder=num%div;
        System.out.println("Remainder is "+Remainder);

    }
}
