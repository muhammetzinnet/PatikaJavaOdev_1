package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Patika Ödevine Hoşgeldiniz...");

        int turkce, matematik, fizik, kimya, tarih, geometri;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Türkçe notunu girin= ");
        turkce = scanner.nextInt();

        System.out.print("Matematik notunu girin= ");
        matematik = scanner.nextInt();

        System.out.print("Fizik notunu girin= ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunu girin= ");
        kimya = scanner.nextInt();

        System.out.print("Tarih notunu girin= ");
        tarih = scanner.nextInt();

        System.out.print("Geometri notunu girin= ");
        geometri = scanner.nextInt();

        int toplam = turkce+matematik+fizik+kimya+tarih+geometri;

        double ortalama = toplam/6;

        double gecmeNotu = 60;

        System.out.println((ortalama==gecmeNotu || ortalama>gecmeNotu));





    }
}
