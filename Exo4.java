public class Exo4{
	public static void main (String[] args){
		//--------------------------------------------------------------------
		// Afficher le résulat de ces opérations sans l'écrire explicitement
		//--------------------------------------------------------------------
		int somme = 0;
		int diff = 0;
		int result = 0;
		int resultat = 0;
		int resultatMul = 0;
		int  resultatDiv = 0;
		int resultatMod = 0;

		// Additionne 50 et 34
		 somme = 0;
			int a = 50;
			int b = 34;
			
				somme += (a + b);
				System.out.println(somme);

		// Soustrait 50 à 34
		diff = 0;
			int c = 50;
			int d = 34;
			 
				diff += (c - d);
				System.out.println(diff);

		// Mutiplie 4 par 80
		 resultatMul = 0;
				int e = 4;
			int f = 80;
			
				resultatMul += (e * f);
				System.out.println(resultatMul);

		// Divise 80 par 4
		resultatDiv = 0;
			int g = 80;
			int h = 4;
	 
				resultatDiv += ( g / h);
				System.out.println(resultatDiv);

		// 50 modulo 3
		resultatMod = 0;
			int k = 50;
			int l = 3;
			
				resultatMod += (k % l);
				System.out.println(resultatMod);


		int i = 9;
		// Ajoute 1 à la variable i
		 i++; 
		 System.out.println(i);


		// Retire 2 à la variable i
		result = 0;
		int j = 9;
		int z = 2;
		
		result+= (i - z);
				System.out.println(result);
   
	}
}