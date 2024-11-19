package sio;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    // Exercice n°1
    // NE PAS EFFACER
    static int[] tabFrequence = new int[11];
    static String[] tabEntetes = new String[]{"2","3","4","5","6","7","8","9","10","11","12"};

    // Exercice n°2
    // NE PAS EFFACER
    static int[][] tableau1Exo2 = new int[][]{{1,2,4},{5,6,7},{2,1,3}};
    static int[][] tableau2Exo2 = new int[][]{{2,2,4},{1,3,5},{1,4,8}};
    static int[][] tableauProduitExo2 = new int[3][3];

    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        do
        {
            do
            {
                System.out.println("1 - Exercice 1");
                System.out.println("2 - Exercice 2");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    for (int i = 0; i < 20; i++) {
                        int de1 = (int) (Math.random() * 6) + 1;
                        int de2 = (int) (Math.random() * 6) + 1;
                        int somme = de1 + de2;
                        tabFrequence[somme - 2]++;
                    }

                    System.out.println("Histogramme des fréquences : ");
                    for (int i = 0; i < tabFrequence.length; i++) {
                        System.out.print(tabEntetes[i] + " : ");
                        for (int j = 0; j < tabFrequence[i]; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            tableauProduitExo2[i][j] = 0;

                            for (int k = 0; k < 4; k++) {
                                tableauProduitExo2[i][j] += tableau1Exo2[i][k] * tableau2Exo2[k][j];
                            }
                        }
                    }

                    System.out.println("Résultat du produit matriciel : ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {

                            System.out.print(tableauProduitExo2[i][j] + "| ");
                        }
                        System.out.println();
                    }
                    break;
            }
        } while (choix != 0);
    }
}