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

// ajouter un enfant 
 public Boolean add_son(Enfant enfant){
        int idp = this.get_sql_parante();
        if(this.seconnect() && idp!= -1){
            int id_e =enfant.get_id();
            String SQL = "INSERT INTO relation_parent_son( id_parent,id_enfant) "
                    + "VALUES(?,?)";
                    Connection cnx = Connection.connecrDb();
            PreparedStatement statement = cnx
                    .prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                statement.setInt(1, idp);
                statement.setInt(2, id_e);
                statement.executeUpdate();
            
            return true;
        }
        return false;
    }
