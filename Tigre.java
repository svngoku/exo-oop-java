class Tigre extends Felin {
    private String nom;

    // Constructeur
    public Tigre(String nom, int age) {
        super(nom, age, new Espece(Espece.Tigre));
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format("%s le 🐯,  je dis grooouuuuwww",this.nom);
    }
}