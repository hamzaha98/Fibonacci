package commy.tennis;

/*
   Programme: Fibonacci
   Description: Cette classe propose une méthode(Boucle) pour calculer le n-ème terme de la suite de Fibonacci
*/

public class Fibonacci {

    // Méthode pour calculer la suite de Fibonacci avec une boucle
    public long fibonacciboucle(long n) {
        // Si n=0 ou n=1 retourne directement n d'après la règle
        if (n <= 1) {
            return n; // single-line comment
        }

        // Initialisation des deux valeurs des deux premiers termes
        long Resultatactuel = 1; // Le terme courant
        long Resultatprec = 0;   // Le terme précédent

        // Utilise une boucle pour calculer les termes suivants de la suite
        for (int i = 2; i <= n; i++) {
            long temp = Resultatactuel; // Utilise une variable temporaire pour stocker Resultatactuel
            Resultatactuel += Resultatprec; // Calcule le terme courant en ajoutant le terme précédent
            Resultatprec = temp; // Met à jour le terme précédent pour la prochaine itération
        }

        return Resultatactuel; // end-of-line
    }
}