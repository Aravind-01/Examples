package j18_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class j18_1 {

	public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class register");
			Connection b=DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root","Aravind@2002");
			System.out.println("success");
			
			Scanner a=new Scanner(System.in);
			System.out.println("enter a id");
			int d=a.nextInt();
			PreparedStatement f=b.prepareStatement("delete from sameer where eid=?");
			
			f.setInt(1,d);
		    
		    int res=0;
		   res= f.executeUpdate();
		    if(res!=0)
		    {
		    	System.out.println("insert");
		    }
		    else {
		    	System.out.println("error");
		    }
		    			
		    a.close();
		}
		catch(ClassNotFoundException|SQLException e){
			System.out.println(e);
		}

	}
}

