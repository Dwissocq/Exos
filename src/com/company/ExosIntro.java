package com.company;

import java.util.Scanner;

public class ExosIntro {

    private static int readInt(Scanner sc,String message){

        int res=-1;
        boolean isValid = false;

        while(!isValid){
            System.out.println(message);
            if(sc.hasNextInt()){
                isValid=true;
                res=sc.nextInt();
                sc.nextLine();
            }
            else{
                System.err.println("Merci de mettre une valeur valide");
                sc.nextLine();
            }
        }
        return res;
    }

    private static void exo1variables(Scanner sc){

        String firstname = "David";
        String name = "Wissocq";
        int age = 38;
        int size = 187;
        String why = "Je rejoins la formation pour commencer une nouvelle carrière passionnante";
        double amount = 1546.52;
    }

    private static void exo2tva(Scanner sc){

        System.out.print("Entrez le prix hors taxe : ");
        double prixHT = sc.nextDouble();
        sc.nextLine();

        System.out.print("Entrez la TVA : ");
        double tva = sc.nextDouble();
        sc.nextLine();

        double prixTTC = (prixHT * (1 + tva/100));

        System.out.println("Le prix total est de : "+String.format("%.2f€",prixTTC));
    }

    private static void exo3bissextile(Scanner sc){

        System.out.print("Entrez une année : ");
        int year = sc.nextInt();
        sc.nextLine();

        boolean b = false;

        if(year % 400 == 0){
            b = true;
        }
        else if(year % 100 == 0){
            b = false;
        }
        else if(year % 4 == 0){
            b = true;
        }
        else{
            b = false;
        }
        if(b==true){
            System.out.println("L'année "+year+" est une année bissextile");
        }
        else{
            System.out.println("L'année "+year+" n'est pas une année bissextile");
        }
    }

    private static void exo4factorielle(Scanner sc){

        // Entrer un chiffre
        System.out.print("Entrer un nombre : ");
        int number = sc.nextInt();
        sc.nextLine();

        int i, f=1;

        for(i=1;i<=number;i++){
            f=f*i;
        }
        System.out.println("La factorielle de "+number+" est égale à : "+f);

    }

    private static void exo5regle(Scanner sc){

        // Demander la longueur de la règle souhaitée

        System.out.println("Entrer la longueur souhaitée de la règle : ");
        int n = sc.nextInt();
        sc.nextLine();

        // Idée d'une boucle qui ajoute un caractère '-' tant que nous ne sommes pas à n

        int i=1;
        char regle='-';
        char regle5='|';
        for (i=1; i<=n; i++){
            if(i%5==0){
                System.out.print(regle5);
            }
            else {
                System.out.print(regle);
            }
        }

    }

    private static void exo6regle2d(Scanner sc){

        //Ecrire un programme qui affiche n colonnes par n lignes

        System.out.print("Entrer votre nombre de lignes :" );
        int nlines = sc.nextInt();
        sc.nextLine();

        System.out.print("Entrer votre nombre de colonnes : ");
        int ncolonnes = sc.nextInt();
        sc.nextLine();

        char ends = '+';
        char lines = '-';
        char columns = '|';
        int i = 1;

        for(i=1; i<=nlines; i++){
            if(i==1){System.out.print(ends);}
            else if(i==nlines){System.out.print(ends);}
            else{System.out.print(lines);}
        }



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Effectuer une boucle pour choisir l'exercice et recommencer si c'est faux

        int numeroExo =-1;

        while(numeroExo!=0){

            numeroExo = readInt(sc,"Entrer le numéro de l'exercice à exécuter (0 pour quitter) : ");

            switch(numeroExo) {
                case 0: {
                    System.out.println("A la prochaine !");
                    break;
                }
                case 1: {
                    exo1variables(sc);
                    break;
                }
                case 2: {
                    exo2tva(sc);
                    break;
                }
                case 3: {
                    exo3bissextile(sc);
                    break;
                }
                case 4: {
                    exo4factorielle(sc);
                    break;
                }
                case 5: {
                    exo5regle(sc);
                    break;
                }
                case 6: {
                    exo6regle2d(sc);
                    break;
                }
                default: {
                    System.err.println("Merci de noter un numéro d'exercice valide");
                    sc.nextLine();
                }
            }



        }

        //exo1(sc);
        //exo2_1(sc);
        //exo2_2(sc);
        //exo3_2(sc);

        sc.close();
    }
}
