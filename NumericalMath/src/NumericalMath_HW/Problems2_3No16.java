package NumericalMath_HW ;

public class Problems2_3No16
{

	float ans4QA ;
	double ans4QB ;

	public void CalQuestionA ()
	{
		for (int j = 1; j <= 50; j++)
		{
			float i = (float) ( j / 100000.0 ) ;
			ans4QA = (float) ( ( cos( i ) - 1/exp( i ) ) / sin( i ) ) ;
//			System.out.println( "i = " + i ) ;
//			System.out.println( i );
//			System.out.println( "ans4Q(a) = " + ans4QA ) ;
			System.out.println( ans4QA );
//			System.out.println() ;
		}
	}

	public void CalQuestionB ()
	{
		for (int j = 1; j <= 50; j++)
		{
			double i = (double) ( j / 100000.0 ) ;
			ans4QB = (double) ( ( cos( i ) -1/ exp( i ) ) / sin( i ) ) ;
//			System.out.println( "i = " + i ) ;
			System.out.println(""+ i );
//			System.out.println( "ans4Q(a) = " + ans4QB ) ;
//			System.out.println( ans4QB );
//			System.out.println() ;
		}
	}
	public void CalQuestionET ()
	{
		for (int j = 1; j <= 50; j++)
		{
			double i = (double) ( j / 100000.0 ) ;
			double ans4Q = (double) (1-i+pow( i , 2 )/3-pow( i , 3)/6);
//			System.out.println( "i = " + i ) ;
//			System.out.println(""+ i );
//			System.out.println( "ans4Q(a) = " + ans4QB ) ;
//			System.out.println( ans4Q );
//			System.out.println() ;
		}
	}
	public void CalQuestionC ()
	{
		for (int j = 1; j <= 50; j++)
		{

			double i = j / 100000.0 ;
			double f = (double) -( 1 / exp( i ) - cos( i ) ) / sin( i ) ;
			double f1 = ( 1 / exp( i ) - sin( i ) ) / sin( i )
					+ ( cos( i ) * ( 1 / exp( i ) - cos( i ) ) ) / pow( sin( i ) , 2 ) ;
			double f2 = -( 1 / exp( i ) + cos( i ) ) / sin( i ) - ( 1 / exp( i ) - cos( i ) ) / sin( i )
					- ( 2 * cos( i ) * ( 1 / exp( i ) - sin( i ) ) ) / pow( sin( i ) , 2 )
					- ( 2 * pow( cos( i ) , 2 ) * ( 1 / exp( i ) - cos( i ) ) ) / pow( sin( i ) , 3 ) ;
			double f3 = ( 1 / exp( i ) + sin( i ) ) / sin( i ) + ( 3 * ( 1 / exp( i ) - sin( i ) ) ) / sin( i )
					+ ( 5 * cos( i ) * ( 1 / exp( i ) - cos( i ) ) ) / pow( sin( i ) , 2 )
					+ ( 6 * pow( cos( i ) , 3 ) * ( 1 / exp( i ) - cos( i ) ) ) / pow( sin( i ) , 4 )
					+ ( 6 * pow( cos( i ) , 2 ) * ( 1 / exp( i ) - sin( i ) ) ) / pow( sin( i ) , 3 )
					+ ( 3 * cos( i ) * ( 1 / exp( i ) + cos( i ) ) ) / pow( sin( i ) , 2 ) ;
			double f4 = -( 6 * ( 1 / exp( i ) + cos( i ) ) ) / sin( i ) - ( 6 * ( 1 / exp( i ) - cos( i ) ) ) / sin( i )
					- ( 4 * cos( i ) * ( 1 / exp( i ) + sin( i ) ) ) / pow( sin( i ) , 2 )
					- ( 12 * pow( cos( i ) , 2 ) * ( 1 / exp( i ) + cos( i ) ) ) / pow( sin( i ) , 3 )
					- ( 20 * cos( i ) * ( 1 / exp( i ) - sin( i ) ) ) / pow( sin( i ) , 2 )
					- ( 28 * pow( cos( i ) , 2 ) * ( 1 / exp( i ) - cos( i ) ) ) / pow( sin( i ) , 3 )
					- ( 24 * pow( cos( i ) , 4 ) * ( 1 / exp( i ) - cos( i ) ) ) / pow( sin( i ) , 5 )
					- ( 24 * pow( cos( i ) , 3 ) * ( 1 / exp( i ) - sin( i ) ) ) / pow( sin( i ) , 4 ) ;

			double T = 1 ;
			double T1 = T + ( f1 * ( i ) ) / 1 ;
			double T2 = T1+ ( f2 * pow( i , 2 ) ) / 2 ;
			double T3 = T2+( f3 * pow( i , 3 ) ) / 6 ;
			double T4 = T3 +( f4 * pow( i , 4 ) ) / 24 ;
//			System.out.printf( "T1 = %s" , T1 ) ;
//			System.out.println( "" + T4);
//			System.out.println() ;
//			System.out.printf( "T2 = %s" , T2 ) ;
//			System.out.println() ;
//			System.out.printf( "T3 = %s" , T3 ) ;
//			System.out.println() ;
//			System.out.printf( "T4 = %s" , T4 ) ;
//			System.out.println() ;
//			System.out.println() ;
		}
	}

	static double sin ( double x )
	{
		double sinX = Math.sin( x ) ;
		return sinX ;
	}

	static double cos ( double x )
	{
		double cosX = Math.cos( x ) ;
		return cosX ;
	}

	static double exp ( double x )
	{
		double expX = Math.exp( x ) ;
		return expX ;
	}

	static double pow ( double x , int pow )
	{
		double powX = Math.pow( x , pow ) ;
		return powX ;
	}

}
