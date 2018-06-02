package com.jeff.threadPractice;

import com.jeff.util.* ;

public class JoinTest
{

	public static void main ( String[] args )
	{
	
		 Thread t1 =new Thread() {
			public void run (  )
			{
				for (int i = 1; i <=20; i++)
				{
				System.out.println( i );	
				}
			}
		};
		Thread t2= new Thread(  ) {
			public void run (  )
			{
				for (int i = 20; i >=1; i--)
				{
					if (i==16)
					{
						try
						{
							t1.join(  );
						} catch (InterruptedException e){}
					}
					Print.println( i ) ;
//					out.println( i );
				}
			}
		};
		t1.start();
		t2.start();
	}

}
