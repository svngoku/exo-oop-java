class Espece {
    final public static String Chat = "Chat";
    final public static String Chien = "Chien";
    final public static String Loup = "Loup";
    final public static String Tigre = "Tigre";

    // zip tp-gmairui-java.zip .  tp-gmairui-java/

    private String espece;

    public Espece(String espece)
    {
        if (espece.equals(Chat)) {
            this.espece =  Chat;
        }
        else if(espece.equals(Chien))
            this.espece =  Chien;
        else if(espece.equals(Loup)) {
            this.espece =  Loup;
        } else if(espece.equals(Tigre)) {
            this.espece =  Tigre;
        } else {
            this.espece = "Type inconnu";
        }
    }

    public int getEspeceNum() {
        switch (this.espece) {
            case Chat:
                return 1;
            case Chien:
                return 2;

            case Loup:
                return 3;
            case Tigre:
                return 4;
            default:
                return -1;
        }
    } 

    @Override
    public String toString() {
        return this.espece;
    }



}