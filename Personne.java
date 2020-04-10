import java.util.LinkedList;

class Personne {
    private String prenom;
    private String nom;
    private int age;
    private Sexe type;

    private LinkedList<Animal> animals = new LinkedList<Animal>();
    private int animalsCount = 0;

    // Le constructeur.
    // 
    // Contruit un objet Personne lors d'une intanciation.
    public Personne(String prenom, String nom, int age, Sexe type) {
        // Affectation des paramètres aux attributs.
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.type = type;
    }

    // Récupère le prénom de la Personne.
    public String getPrenom() {
        return this.prenom;
    }

    // Récupère le nom de la Personne.
    public String getNom() {
        return this.nom;
    }

    // Récupère l'âge de la Personne.
    public int getAge() {
        return this.age;
    }

    // Récupère du type de la Personne.
    public Sexe getType() {
        return this.type;
    }

    // Modifie le prénom.
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Modifie le nom.
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Modifie l'âge.
    public void setAge(int age) {
        this.age = age;
    }

    // Modifie le type.
    public void setType(Sexe type) {
        this.type = type;
    }

    // Ajout d'un Animal.
    public void addAnimal(Animal a) {
        this.animals.add(a);
        this.animalsCount++;
    }

    // Compte le nombre d'animaux.
    public int countAnimal() {
        return this.animalsCount;
    }

    // Retourne un Animal.
    public Animal getAnimal(int pos) {
        return this.animals.get(pos);
    }

    // Rendre printable Personne.
    @Override
    public String toString() {
        return String.format("%s,%s,%d,%s(%d)", this.prenom, this.nom, this.age, this.type, this.type.getTypeNum());
    }
}
