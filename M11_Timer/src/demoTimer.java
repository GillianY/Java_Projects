import java.util.*;

public class demoTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
	
		//timer.schedule(new timertask(),0,1000 );
		//timer.schedule(timertask,0,1000 );
		
		
		timer.schedule(new TimerTask(){
			int counter =1;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(new Date().toString());
				if(++counter >10)
				{
					timer.cancel(); //cancel timer
					timer.purge(); // delete schedule
				}	
			}
			
		},0,1000 );

	}

	class timertask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(new Date().toString());
		}
		
	}
	
}
