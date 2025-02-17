import java.util.Arrays;

public class Exo14{
	public static void main (String[] args) {
		  int[] tableau1 = {1, 2, 3};
        int[] tableau2 = {4, 5, 6};

        // Création d'un tableau fusionné de la bonne taille
        int[] tableauFusionne = new int[tableau1.length + tableau2.length];

        // Copie des éléments du premier tableau
        for (int i = 0; i < tableau1.length; i++) {
            tableauFusionne[i] = tableau1[i];
        }

        // Copie des éléments du second tableau
        for (int i = 0; i < tableau2.length; i++) {
            tableauFusionne[tableau1.length + i] = tableau2[i];
        }

        // Affichage du tableau fusionné
        System.out.println("Tableau fusionné : " + Arrays.toString(tableauFusionne));
	}
}