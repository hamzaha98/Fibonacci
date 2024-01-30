package commy.tennis;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.println("Donner une valeur"); // Demande à l'utilisateur de saisir une valeur
        long nombre = sc.nextLong();
        Fibonacci F = new Fibonacci(); // Création d'un objet Fibonacci

        //Calcul du temps de traitement
        long startTime = System.nanoTime();
        long resultClassique = F.fibonacciboucle(nombre); //Calcul de la suite Fibonacci
        long endTime = System.nanoTime();
        long duree = (endTime - startTime) / 1000; // en microsecondes
        // Affichage du résultat et du temps de traitement du calcul de la suite de Fibonacci
        System.out.println("Suite fibonacci est : "+resultClassique);
        System.out.println("La durée du traitement est :"+duree+" microsecondes ");
    }
}