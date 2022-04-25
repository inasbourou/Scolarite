package Model;

public class Compte {
    private String num;
    private String login;
    private String mdp ; 
    public Compte(String mun , String login ,String mdp ){
        this.num = num;
        this.login = login;
        this.mdp = mdp ; 
    }
    public void setNum(String num) {
        this.num = num;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public void setLogin(String login) {
        this.login = login;
    }
}
