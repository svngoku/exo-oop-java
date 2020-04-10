class Loup extends Canin {
    private String nom;

    // Constructeur
    public Loup(String nom,int age) {
        super(nom,age,new Espece(Espece.Loup));
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format("%s le 🐺,  je dis ",this.nom);
    }
}