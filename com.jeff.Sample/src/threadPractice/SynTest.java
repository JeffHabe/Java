package threadPractice ;

import com.jeff.util.Print ;

public class SynTest
{

	private int a ;

	public static void main ( String[] args )
	{
		final SynTest test = new SynTest() ;
		final Thread t1 = new Thread()
		{

			public void run ()
			{
				for (int i = 0; i < 10; i++)
				{
					Print.println( getName() + ":" + test.setA() ) ;
				}
			}
		} ;
		Thread t2 = new Thread()
		{

			public void run ()
			{
				for (int i = 0; i < 10; i++)
				{
					Print.println( getName() + ":" + test.setA() ) ;
					// out.println( i );
				}
			}
		} ;
	
		t1.start() ;
		t2.start() ;

	}

	// synchronized public int setA ()
	// {
	// a++ ;
	// for (int y = 0; y < 1000000000; y++)
	// ;
	// return a ;
	// }

	public int setA ()
	{
		synchronized (this)
		{
			a++ ;
			for (int y = 0; y < 1000000000; y++)
				;
			return a ;
		}
	}

}
