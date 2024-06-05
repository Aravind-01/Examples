
import java.util.Scanner;

public class curd_main {

	public static void main(String[] args) {
  try {
    CRUD cr=new CRUD();
    System.out.println("1.Insert the values");
    System.out.println("2.view values");
    System.out.println("3.update the values");
    System.out.println("4.delete the values");
    Scanner z=new Scanner(System.in);
    int opt=z.nextInt();
	
	if(opt==1)
	{
		System.out.println("enter  ID");
		int id=z.nextInt();
		System.out.println("enter  name");
		String name=z.next();
		System.out.println("enter  sal");
		int sal=z.nextInt();
		System.out.println("enter  dept");
		String dep=z.next();
		cr.insert(id, name, dep, sal);
		
	}

	   else if(opt==2)
	  {
		   cr.view();
	  }

	   else if(opt==3)
	   {
		System.out.println("enter a salrey");
		int sal=z.nextInt();
		System.out.println("enter a id");
		int id=z.nextInt();
		cr.update(sal,id);
	   }
	   else if(opt==4)
	   {
		   System.out.println("enter a id");
			int id=z.nextInt();
			if(cr.delete(id)>0)
			{
				System.out.println("Insert");
			}
	   }
  
	  else 
	  {
		System.out.println("Invalid input");
	  }
  }
	catch(Exception e)
	{
		System.out.println(e);
	}
   
}
}
