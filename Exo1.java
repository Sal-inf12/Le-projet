public class Exo1 {
    public static void main(String[] args) {
        // Vérifier si exactement deux arguments ont été fournis
        if (args.length < 2) {
			 System.out.println("Veuillez fournir un nom et un âge.");
            return;
            // Récupérer le prénom et le nom de famille
            String prenom = args[0];  // Premier argument = prénom
            String nom = args[1];     // Deuxième argument = nom

            // Afficher le message de bienvenue
            System.out.println("bonjour " + prenom + " " + nom);
        } else {
            // Message d'erreur si l'utilisateur n'a pas fourni exactement 2 arguments
            System.out.println("Erreur : veuillez entrer un prénom et un nom.");
            System.out.println("Utilisation : java Exo1 <Prénom> <Nom>");
        }
    }
}