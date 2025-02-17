import java.util.Arrays;

public class Exo13 {
    public static void main(String[] args) {
        int[] tableau = new int[50]; // Tableau initial
        int[] tmp = new int[51]; // 7 valeurs uniques (5, 1, 2, 4, 6, 7, 8)
        int index = 0; // Position dans tmp
		for(int i = 0; i < tableau.length; i++){
            tableau[i] = (int)(Math.random() *11);
        }
		// Affichage du tableau avec doublons
        System.out.println("Tableau avec doublons :");
        System.out.println(Arrays.toString(tableau));

        // Vérification et ajout des valeurs uniques dans tmp
        for (int i = 0; i < tableau.length; i++) {
            boolean estDejaPresent = false;

            // Vérifier si tableau[i] est déjà dans tmp
            for (int j = 0; j < index; j++) {
                if (tableau[i] == tmp[j]) {
                    estDejaPresent = true;
                    break;
                }
            }

            // Si la valeur est unique, l'ajouter à tmp
            if (!estDejaPresent) {
                tmp[index] = tableau[i];
                index++; // Augmenter l'index pour le prochain élément
            }
        }

        // Affichage du tableau filtré
		
        System.out.println("Tableau sans doublons : " + Arrays.toString(Arrays.copyOf(tmp, index)));
    }
}