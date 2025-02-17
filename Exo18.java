import java.util.Random;

public class Exo18{
public static void main (String[] args){
	Random rand = new Random();
int[] tableau = new int[100];

System.out.print("[ ");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(11); // Génère un nombre entre 0 et 10
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
		 for (int i = 1; i <= 10; i++) {
            int occurences = compter(tableau, i);
		 System.out.println("Le nombre " + i + " apparaît " + occurences + " fois dans le tableau.");}
}
	public static int compter(int[] tableau, int nombre){
		
		int compteur = 0;
		for(int i = 0; i < tableau.length;i++){
			if(tableau[i] == nombre){ compteur++;
			}
		} return compteur;
}
		
	}
