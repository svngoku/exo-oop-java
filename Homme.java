class Homme extends Personne {
    public Homme(String prenom, String nom, int age) {
        super(prenom, nom, age, new Sexe(Sexe.Homme));
    }
}
