
 public class ExoArguments  {

    public static void main(String[] args) {
        // Vérification du nombre d'arguments
        if (args.length < 2) {
            System.out.println("Veuillez fournir un nom et un prenom.");
            return;
        }

        // Récupération des arguments
        String nom = args[0];  // Le premier argument : le nom
        String prenom = args[1];   // Le deuxième argument : le prenom

        // Affichage du message
        System.out.println("Bonjour  " + nom + " " + prenom );
    }
}