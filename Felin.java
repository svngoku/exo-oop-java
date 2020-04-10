import java.util.*;

class Felin implements Animal {
    private String nom;
    private int age;
    private Espece espece;
    static LinkedList<Espece> listEspeces = new LinkedList<Espece>();

    public Felin(String nom, int age, Espece espece) 
    {
        this.nom = nom;
        this.age = age;
        this.espece = espece;
    }

    
    public String crie() {
        return "miaou";
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return "Felin";
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
