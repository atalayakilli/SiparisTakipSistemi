
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
    
   private String driver = "com.mysql.jdbc.Driver";
   private String url = "jdbc:mysql://localhost/";
   private String encode = "?useUnicode=true&characterEncoding=utf-8";
   // database açılırken türkçe karakter desteği ile açılsın.
   
   private String dbName = "finalproject";
   private String userName = "root";
   private String userPass = "";
   
   private Connection con = null;
   private Statement st = null;

    public DB() {
    }
   
    // farklı databeselere bağlanabilmek için kurucu methoda parametre gönderilir.
    public DB(String dbName, String userName, String userPass) {
        this.dbName = dbName;
        this.userName = userName;
        this.userPass = userPass;
    }
    
    // bağlan methodu
    public Statement baglan() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url+dbName+encode, userName, userPass);
            st = con.createStatement();
            System.out.println("Baglanti Basarili");
        } catch (Exception e) {
            String reason ="Class: DB, Function : baglan --- ";
             Giris grs = new Giris();
             grs.hataYaz(reason,e);
        }
        return st;
    }
    
    
   
   
    
    
    
}
