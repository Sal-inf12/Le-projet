import java.util.Random;
public class Exo10{
	public static void main (String[] args) {
		int max = 0;
		int min = 0;
		int nombres [] = new int [5];
		Random rand = new Random();
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = rand.nextInt(101);
		}
		System.out.print("[ ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println(" ]"); 
		// Trouver le min et  le max
		min = nombres[0];
		for (int i = 0; i < nombres.length;i++){
			if(max < nombres[i]){
				max = nombres[i];
			
			} if(min > nombres[i]){
				min = nombres[i];
			}
			
		} 
		System.out.println("Le maximum est : " + max);
		System.out.println("Le minimum est : " + min );
	}
}