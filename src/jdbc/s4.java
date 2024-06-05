package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class s4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class register");
			Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","Aravind@2002");
			System.out.println("success");
			System.out.println("eneter a id");
			int id=s.nextInt();
			System.out.println("eneter a name");
			String name=s.next();
			System.out.println("eneter a dept");
			String dept=s.next();
			System.out.println("eneter a salrey");
			int salrey=s.nextInt();
			
			String b="insert into arv values(?,?,?,?)";
			PreparedStatement os=a.prepareStatement(b);
			os.setInt(1,id);
			os.setString(2,name);
			os.setString(3,dept);
			os.setInt(4,salrey);
			os.executeUpdate();
			System.out.println("stored");
			
			a.close();
		}
		catch(ClassNotFoundException|SQLException e){
			System.out.println(e);
			
		}

	}

}
