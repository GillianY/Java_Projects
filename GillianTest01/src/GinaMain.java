import java.io.*;
import java.util.*;


public class GinaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	/* for(int i = 0; i < args.length; i++) {
	            System.out.println(args[i]);
	        }
	        */
		
		getInput();
		 
		CollectionsP test = new CollectionsP();
		test.aboutList();
		test.aboutArrayList1();
		test.aboutSet();
		test.aboutMaps();
		
		
		
	}
	
	
	/**
	 * get input from console :
	 * */
	public static void getInput()
	{
		  // ====
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter user name1 : ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You entered : " + username);

        // ===== In Java 5, Java.util,Scanner is used for this purpose.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter user name2 : ");
        username = in.nextLine();      
        System.out.println("You entered : " + username);
 
 
        // ====== Java 6
        /* 
           ---- Eclipse nullponiter exception
        Console console = System.console();
        username = console.readLine("Please enter user name3 : ");   
        System.out.println("You entered : " + username);
		*/
	}

}
