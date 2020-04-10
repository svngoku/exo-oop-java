class Femme extends Personne {
    public Femme(String prenom, String nom, int age) {
        super(prenom, nom, age, new Sexe(Sexe.Femme));
    }
}
