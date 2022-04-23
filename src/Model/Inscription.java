package Model;
import java.sql.Date;

public class Inscription {
    private Date date ; 
    public Inscription (Date date){
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
