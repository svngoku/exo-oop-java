class Chien extends Canin {
    private String nom;

    public Chien(String nom, int age) {
        super(nom, age, new Espece(Espece.Chien));
        this.nom = nom;
    }
    /**
     * @return String 
     * Constructeur de l'objet 🐶 
     */
    @Override
    public String toString() {
        return String.format("%s le 🐶,je dis Woooaf", this.nom);
    }

}
