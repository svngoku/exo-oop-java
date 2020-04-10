class Main {
    public static void main(String[] args) {
        // Création de Personne.
        Personne p1 = new Personne("John", "Doe", 42, new Sexe(Sexe.Homme));
        // Création d'Homme et Femme.
        Personne toto = new Homme("Toto", "Tata", 87);
        Personne amandine = new Femme("NGESSO", "Amandine", 25);

        // Création des animaux.
        Canin a1 = new Chien("Fox", 12);
        Felin a2 = new Chat("Garfield", 14);
        Animal a3 = new Chien("Titouin",5);
        Felin a4 = new Tigre("Shere Kan", 9);

                
        // Animaux
        System.out.println(a1);
        System.out.println(a2.crie());
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);


        // Affiche Homme ou Femme.
        System.out.println(p1);
        System.out.println(toto);
        System.out.println(amandine);

        // Ajout de deux animaux à p1.
        p1.addAnimal(a1);
        p1.addAnimal(a2);

        System.out.printf("%s a %d animaux:\n", p1.getPrenom(), p1.countAnimal());
        for (int i = 0; i < p1.countAnimal(); i++) {
            System.out.printf("%s qui est un %s\n", p1.getAnimal(i).getNom(), p1.getAnimal(i).getType());
        }

    }
}
