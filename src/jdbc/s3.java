package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class s3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class register");
			Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","Aravind@2002");
			System.out.println("success");
			String d="create table arv(id int,name varchar(20),dept varchar(20),salrey int)";
			Statement s=a.createStatement();
			s.executeUpdate(d);
					
			
		}
		catch(ClassNotFoundException|SQLException e){
			System.out.println(e);
		}
	}

}