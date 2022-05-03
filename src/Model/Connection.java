import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connection {
    Connection cnx = null;

    public static Connection connecrDb(){
        try{
 
            try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    JOptionPane.showMessageDialog(null,"Driver trouvé");
                        } catch (InstantiationException ex) {
                         Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                        Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
               }
          //remplir ici
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/mouhsene", "root", "frii");
            JOptionPane.showMessageDialog(null,"connection reussi");
            return cnx;
 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
 
    }
}
