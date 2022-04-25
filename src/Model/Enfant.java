package Model;

public class Enfant extends Personne{
    private int age ; 
    private String niveaux_S;
    public Enfant(String nom , String prenom , String address , int age ,String niveaux_S){
        super(nom , prenom , address);
        this.age = age ; 
        this.niveaux_S= niveaux_S;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNiveaux_S(String niveaux_S) {
        this.niveaux_S = niveaux_S;
    }
    public String getNiveaux_S() {
        return niveaux_S;
    }
    public int getAge() {
        return age;
    }
}
