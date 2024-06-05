package j18;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class j18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class register");
			Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","Aravind@2002");
			System.out.println("success");
			System.out.println("eneter a id");
			String d="delete akshay where id=?";
			Statement s=a.createStatement();
			s.executeUpdate(d);
					
			
		}
		catch(ClassNotFoundException|SQLException e){
			System.out.println(e);
		}

	}

}
