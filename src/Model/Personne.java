package Model;

public class Personne {
    private String nom ;
    private String prenom ; 
    private String address;

    public String getAddress() {
        return address;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Personne ( String s1, String s2, String s3) {
        this.nom = s1 ; 
        this.prenom = s2;
        this.address = s3 ; 
    }
}
