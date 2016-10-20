import java.lang.reflect.Array;
import java.util.*;

/**
 * Reg http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 * 
 * review java 
 * */

public class CollectionsP {

	
	
	public CollectionsP() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	
	/*
	 * about ArrayList
	 * */
	public boolean aboutArrayList1()
	{
		String msg="\n";
		ArrayList<String> al = new ArrayList(); 
		al.add("Gillian");
		
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		List<Integer> collector = new ArrayList<>();
		collector.add(10);
		collector.addAll(numbers);
		collector.size(); // 4
		
		for(int i: collector)
		{
			msg+="\t"+i;
		}	
		System.out.println(msg);
		return true;
	}
	
	
	/**
	 * about List
	 * */
	
	public boolean aboutList()
	{
		String msg="\n";
		List<Integer> numbers =Arrays.asList(10,24,33);
		
		//error :ArrayList<Integer> lists = (ArrayList)numbers;
		String str = "a + b - c * d / e < f > g >= h <= i == j";
		
		String[] notops = str.split("\\s*[^a-zA-Z]+\\s*");
	  	String[]  ops=str.split("\\s*[a-zA-Z]+\\s*"); 
	  	List<String> lists =Arrays.asList(notops);
	  	ArrayList<String> as = new ArrayList();  
	  	
		as.addAll(lists);
		for(String a :as)
		{
			msg+="\t"+a;
		}
		System.out.println(msg);
		return true;
	}

	/**
	 * Set: collection , elements will not duplicate ;
	 * */
	public boolean aboutSet()
	{
		
		Set<String> sells = new HashSet<>(Arrays.asList("apple","pen","pinapple","banana","pappers","tests"));
		Set<String> buyinglists = new HashSet<>(Arrays.asList("apple","lipsticks","clothes","pen"));
		
		System.out.println("in apple there?"+sells.contains("apple") );
		System.out.println("size:"+sells.size() );
		sells.add("masks");
		sells.add("banana"); // will not deuplicate
		System.out.println("size:"+sells.size() );
		sells.remove("tests");
		System.out.println("size:"+sells.size() );
		
		//error
		//Set<String[]> menus =new HashSet<>(Arrays.asList(["test1","test2","test3"],["name1","name2"]));
		
		 // in both HashSets
		 Set<String> intersection = new HashSet<>(sells); 
	     intersection.retainAll(buyinglists);
	 	 System.out.println(intersection);
	 	 
	 	 
	 	 // Sets that contain bouth sets
	 	 Set<String> union = new HashSet<>(sells);
	     union.addAll(buyinglists); 
	     System.out.println(union);
	     
	     Set<String> xor = new HashSet<>(sells);
		 xor.removeAll(buyinglists);
		 System.out.println(xor);
	 	
		 
		 System.out.println("contains:"+sells.containsAll(intersection));
	 	
		return true;
	}
	
	
	public boolean aboutMaps()
	{
		Map<String,Integer> pwds = new HashMap<>();
		pwds.put("Gina",123456);
		pwds.put("Tom",2345456);
		pwds.put("KT",5552222);
		pwds.put("Future",2017);
		
		System.out.println("Tom:"+ pwds.get("Gina") );
		pwds.remove("Tom");
		System.out.println(pwds.entrySet());
		System.out.println(pwds.size());
		System.out.println(pwds.values());
		System.out.println(pwds.keySet());
		return true;
	}
	
	/*
	public String CollectionToString(Collection <E> test)
	{
		
	}
	*/
	
	
   
	public String parseDay(Day day){
		
		String msg= "";
		
		switch(day)
		{
			case SUNDAY:
				msg= "Sunday is holiday";
				break;
			case MONDAY:
				msg= "MONDAY make me broken";
				break;
			case SATURDAY:
				msg= "it is a good day ";
				break;
			default:
				msg="sing a song";
				break;	
		}
		
		return msg;
	}
	
	
	private enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	    THURSDAY, FRIDAY, SATURDAY 

		}

}