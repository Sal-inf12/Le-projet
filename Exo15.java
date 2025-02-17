import java.util.Arrays;
import java.util.Random;

public class Exo15{
	public static void main (String[] args){
		 int[] tableau = new int[10]; // Création du tableau de taille 10
        Random rand = new Random();  // Objet Random pour générer des nombres aléatoires
        int nombrePairs = 0;         // Compteur pour les nombres pairs

        // Remplissage du tableau avec des nombres aléatoires entre 0 et 100
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(101); // Génère un nombre entre 0 et 100 inclus
            if (tableau[i] % 2 == 0) {      // Vérifie si le nombre est pair
                nombrePairs++;
            }
        }

        // Affichage du tableau
        System.out.println(Arrays.toString(tableau));

        // Affichage du nombre de nombres pairs
        System.out.println("Il y a " + nombrePairs + " nombres pairs dans ce tableau.");
	}
}