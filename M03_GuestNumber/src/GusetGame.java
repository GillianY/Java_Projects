import java.util.Scanner;

public class GusetGame {
	
	  private int answer=0;
	  private String userInput="";
	  private int count=0;
	  private  int upperbound ;
	  private  int lowerbound ;
	  private  int maxguessCount ;
	  String msg="";
	
	  public GusetGame()
	  {
		    this.upperbound = 80;
			this.lowerbound = 12;
			this.maxguessCount = 50;
			msg="";
			answer= (int) (lowerbound+ Math.random()*(upperbound-lowerbound+1));
	  }
	
	
   public GusetGame(  int lowerbound,int upperbound, int maxguessCount) {
		super();
		this.upperbound = upperbound;
		this.lowerbound = lowerbound;
		this.maxguessCount = maxguessCount;
		msg="";
		answer= (int) (lowerbound+ Math.random()*(upperbound-lowerbound+1));
	}
	 
   
   public void guestStart(){
		System.out.println( answer+"please input an integer between "+lowerbound+"~"+upperbound);
		 Scanner sc = new Scanner(System.in);
		 boolean b = false;
		 for(int i=0;i<maxguessCount &&(!b);i++)
		 {
			 b= checkanwser(sc.next(),i+1);
		 }	
		 
		 if(!b)
		 {
			 System.out.println("猜測超過次數:"+maxguessCount+"次");
		 }else
		 {
			 System.out.println("Good job! THE ANSWER IS"+	answer);
		 }	 
	   
   }
   
   public  boolean  checkanwser(String input ,int count)
	{
		//TODO checkinput
		
		boolean result = false;
		 msg = "";
		try{
			int tmpanser=Integer.parseInt(input);
		 
			
		
			 if(tmpanser== answer)
			 {
				//姣斿皪鎴愬姛,杓稿嚭娆℃暩鑸囪В绛�
				 msg="corrent! Your guest count"+count;
				 result= true;
			 }else if(tmpanser>answer && tmpanser<=upperbound)
			 {	 	//姣斿皪澶辨晽,瑾挎暣涓婁笅閭婄晫
				  upperbound =tmpanser-1;
				  msg = "youranser:"+tmpanser+" :"+lowerbound+"~"+upperbound;
				  result= false;
			 }else if(tmpanser<answer && tmpanser>=lowerbound)
			{
					 lowerbound =tmpanser+1;
					 msg = "youranser:"+tmpanser+" :"+lowerbound+"~"+upperbound;
					  result= false;
			} else{
				msg="please input an integer between "+lowerbound+"~"+upperbound;
				result =false;		
			}
		}catch (Exception e)
		{
			
			 System.out.println("Error input type,please input an integer, your count:"+count);
			 return false;
		}
		System.out.println(msg);
		return result;
		
	}
	
    
	
	  
	  
	
}
