class Sexe {
    // Déclaration des constantes (final) des
    // type d'une Personne.
    final public static String Homme = "homme";
    final public static String Femme = "femme";
    final public static String Undefined = "non défini";

    // Déclaration du type.
    private String type;

    // Contruction du Sexe.
    public Sexe(String type) {
        type = type.toLowerCase();

        // Si c'est un Homme, alors Homme,
        // sinon par défaut Femme.
        if (type.equals(Homme)) {
            this.type = Homme;
        } else if (type.equals(Femme)) {
            this.type = Femme;
        } else {
            this.type = Undefined;
        }
    }

    // Récupération du type numérique.
    public int getTypeNum() {
        if (this.type.equals(Homme)) {
            return 1;
        } else if (this.type.equals(Femme)) {
            return 0;
        } else {
            return -1;
        }
    }

    // Rendre printable Sexe.
    @Override
    public String toString() {
        return this.type;
    }
}
