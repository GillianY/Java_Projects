
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1");
System.out.println("2");

Thread t1 = new Thread(new MyRunnable());
t1.start();

 new HelloTreahd().start();
// new Thread(new MyRunnable()).start();
 
 new Thread(new Runnable(){
	 public void run() {
		// System.out.println("ananymous thread1");
		 for(int i =0;i<10; i++)
			{System.out.println("ananymous thread1"+i);	}
 }}).start();
 
 new Thread(){
	 public void run() {
		 System.out.println("ananymous thread2"); 
			
	 }
 }.start();
 
System.out.println("3");		
System.out.println("main end");		
	}

}


class MyRunnable implements Runnable {
    public void run() 
    {
	for(int i =0;i<100; i++)
	{System.out.println(" MyRunnable thread"+i);
	
	}
		
		
	}
}
    
    class HelloTreahd extends Thread{	
    	public void run() {
    		//System.out.println("hello thread");
    		try{
    			for(int i =0;i<100; i++)
    			{System.out.println(" hello thread"+i);
    			
    			
    			this.sleep(1000);
    			}
    		}catch(Exception e)
    		{"e".toString();}
    	}
    }

