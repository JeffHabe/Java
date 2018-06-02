
public class year1
{

	public static void main ( String[] args )
	{
		int count = 0 ;
		String str = "" ;
		int i = 4 , sum = 0 ;
		while (i >= 0)
		{
			switch (i)
			{
				case 4:
					break ;
				case 3:
					if (count == i + 1)
					{
						str = String.valueOf( i + 1 ) ;
						sum+=(i+1)*(i+1);
						System.out.print( str ) ;
						count = 5 ;
					}
					break ;
				case 2:
					if (count == i + 1)
					{
						str = String.valueOf( i + 1 ) + str ;
						sum+=(i+1)*(i+1);
						System.out.print( str ) ;
						count = 5 ;
					}
					break ;
				case 1:
					if (count == i + 1)
					{
						str = String.valueOf( i + 1 ) + str ;
						sum+=(i+1)*(i+1);
						System.out.print( str ) ;
						count = 5 ;
					}
					break ;
				case 0:
					if (count == i + 1)
					{
						str = String.valueOf( i + 1 ) + str ;
						sum+=(i+1)*(i+1);
						System.out.print( str ) ;
						count = 5 ;
					}
					break ;
				default:

					break ;
			}
			if (count == 5)
			{
				i-- ;
				count = 0 ;
				System.out.println() ;
			} else
			{
				System.out.print( "*" ) ;
				count++ ;
			}
		}
		System.out.println( "Sum = " + sum ) ;
	}

}
