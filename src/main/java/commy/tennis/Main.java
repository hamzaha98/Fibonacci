package commy.tennis;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        System.out.println("Donner une valeur"); // Demande à l'utilisateur de saisir une valeur
        long nombre = sc.nextLong();
        Fibonacci F = new Fibonacci(); // Création d'un objet Fibonacci
        System.out.println(F.fibonacciboucle(nombre)); // Affichage du résultat du calcul de la suite de Fibonacci
    }
}