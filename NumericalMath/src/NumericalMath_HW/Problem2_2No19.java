package NumericalMath_HW ;

public class Problem2_2No19
{

	double[] j = new double[ 20 ] ;

	public void CalQa ()
	{

		j[0] = 0.7651976865 ;
		j[1] = 0.4400505857 ;

		for (int i = 1; i < 19; i++)
		{
			j[i + 1] = ( 2 * i *  Math.pow( 1 , -1 ) * j[i] - j[i - 1] ) ;
		}
		System.out.println( j[19] ) ;

	}

	public void CalQb ()
	{

		j[18] = 1.548478441 ;
		j[19] = 3.873503009 ;

		for (int i = 18; i >= 1; i--)
		{
			j[i - 1] = ( 2 * i *  Math.pow( 1 , -1 ) * j[i] - j[i + 1] ) ;
		
			;
		}
		System.out.println( j[0] ); 

	}
}
