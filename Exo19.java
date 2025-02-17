import java.util.Random;
public class Exo19{
	static int[] tab = new int[10];
public static void main (String[] args){
	Random rand = new Random();

System.out.print("[ ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(101); // Génère un nombre entre 0 et 10
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
		ordonner();
		 System.out.print("Tableau trié : [ ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
}
public static void ordonner(){
	int temp;
	 for (int i = 0; i < tab.length -1; i++){
		  for (int j = 0; j < tab.length -1 -i; j++)
			  if(tab[j] > tab[j +1]) {
				  temp = tab[j];
				  tab[j] = tab[j +1];
				  tab[j +1] =temp;
			  }
	 }
}
}