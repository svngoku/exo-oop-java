class Chat extends Felin {
    private String nom;

    // Constructeur
    public Chat(String nom, int age) {
        super(nom, age, new Espece(Espece.Chat));
        this.nom = nom;
    }

    @Override
    public String toString() {
        return String.format("%s le 🐱,  je dis miaou",this.nom);
    }

}
