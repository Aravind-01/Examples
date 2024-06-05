package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ara {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("installed");
			String url="jdbc:mysql://localhost:3306/aravind";
			String user="root";
			String pass="Aravind@2002";
			Connection con=DriverManager.getConnection(url,user,pass);
		}
		catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
		}

	}

}
  