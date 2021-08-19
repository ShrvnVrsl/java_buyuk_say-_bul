package com.company;

public class Main {
    //resubility;kodları tekrar tekrar kullanılabilirlik.

    public static void main(String[] args) {
       int sayi1=20;
       int sayi2=25;
       int sayi3=22;

       if (sayi1>sayi2&&sayi1>sayi3)
       {
           System.out.println("EN BÜYÜK SAYI ----> " + sayi1);
       }
       else if (sayi2>sayi1&&sayi2>sayi3)
       {
           System.out.println("EN BÜYÜK SAYI ----> "+sayi2);
       }
       else
       {
           System.out.println("EN BÜYÜK SAYI ----> "+sayi3);
       }
    }
}
