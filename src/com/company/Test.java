package com.company;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le prix hors taxe : ");
        double prixHT = sc.nextDouble();
        sc.nextLine();

        System.out.print("Entrez la TVA : ");
        double tva = sc.nextDouble();
        sc.nextLine();

        double prixTTC = (prixHT * (1 + tva/100));

        System.out.println("Le prix total est de : "+String.format("%.2f€",prixTTC));

        sc.close();
    }
}
