package j18_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class j_2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class register");
			Connection b=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Aravind@2002");
			System.out.println("success");
			Scanner a=new Scanner(System.in);
			System.out.println("enter a update salrey");
			int g=a.nextInt();
			System.out.println("enter a id");
			int d=a.nextInt();
			PreparedStatement f=b.prepareStatement("update sai set esal=? where eid=?");
			
			f.setInt(1,g);
			f.setInt(2,d);
		    f.executeUpdate();
		    a.close();
		}
		catch(ClassNotFoundException|SQLException e){
			System.out.println(e);
		}

	}

}
