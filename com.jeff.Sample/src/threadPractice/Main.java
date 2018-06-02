package threadPractice ;

public class Main
{

	public static void main ( String[] args )
	{
		// TODO Auto-generated method stub
		MyThread myth = new MyThread() ;
		MyRunnable myRunnable = new MyRunnable() ;
		Thread t = new Thread( myRunnable ) ;
		myth.start() ;
		t.start() ;
	}

}
