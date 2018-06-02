package com.jeff.threadPractice;


public class MyRunnable implements Runnable
{
	public void run (  )
	{
		for (int i = 20; i>=1 ; i--)
		{
			System.out.println( i );
		}
	}
}
