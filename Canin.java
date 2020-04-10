
class Canin implements Animal {
    private String nom;
    private int age;
    private Espece espece;

    public Canin(String nom, int age, Espece espece) {
        this.nom = nom;
        this.age = age;
        this.espece = espece;
    }

    // public void addCanin(Canin c) {
    // this.canins.add(c);
    // }

    public String crie() {
        return "woaf";
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return "Canin";
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s,%d,le %s fait %s", this.nom, this.age, this.getType(), this.crie());
    }
}
