public class Exo17{
 public static void main (String[] args){
	 char[] tableau = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};  // Tableau de caractères
        int compteurVoyelles = 0;  // Compteur pour les voyelles

        // Boucle pour parcourir le tableau et compter les voyelles
        for (char c : tableau) {
            if (estVoyelle(c)) {
                compteurVoyelles++;
            }
        }

        // Affichage du résultat
        System.out.println("Il y a " + compteurVoyelles + " voyelles dans le tableau.");
    }

    // Méthode pour vérifier si un caractère est une voyelle
    public static boolean estVoyelle(char c) {
        c = Character.toLowerCase(c); // Pour traiter les majuscules et minuscules de manière uniforme
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
 }
}