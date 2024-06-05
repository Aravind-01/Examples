package mini_project;

import java.util.Scanner;

public class view_gm {

	public static void main(String[] args) {
	  while (true) {
		try {
			Scanner sc=new Scanner(System.in);
			gym_claas b=new gym_claas();
			System.out.println("1.view my profile:");
			System.out.println("2.trainer details");
			System.out.println("3.view equipment details");
			System.out.println("0.Exit");
			//int i=sc.nextInt();
			int num=sc.nextInt();
		if(num==0)
		{
			System.out.println("Exiting...");
            break;
		}
	    if(num==1)
	    {
	    //gym_claas a= new gym_claas();
		System.out.println("enter a id");
		int id=sc.nextInt();
		b.profile(id);		
		}
	    else if(num==2)
	    {
	    	b.tr();
	    }
	    else if(num==3)
	    {	
    	    
	        b.vq(num,0);
	      
	    }
		
	    else {
	    	System.out.println("invalid input");
	    }
	}
	
	  
	
		catch(Exception e)
		{
			System.out.println(e);
		}

	}


	}
}
