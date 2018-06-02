package threadPractice;


public class MyThread extends Thread
{
	public void run() {
		for(int a=1;a<=20;a++) {
			System.out.println( a );
		}
	}

}
