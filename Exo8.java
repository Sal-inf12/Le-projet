import java.util.Random; // Import de la classe Random

public class Exo8 {
    public static void main(String[] args) {
        int[] nombres = new int[5]; // Création du tableau de taille 5
        Random rand = new Random(); // Création d'un objet Random

        // Remplissage du tableau avec des nombres aléatoires entre 0 et 100
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = rand.nextInt(101); // Génère un nombre entre 0 et 100 inclus
        }

       // Affichage des valeurs du tableau sous un format propre
        System.out.print("[ ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", "); // Ajouter une virgule entre les valeurs
            }
        }
        System.out.println(" ]"); // Fermeture du tableau
    }
}