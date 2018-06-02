package NumericalMath_HW ;

public class programFirst
{

	public static int n = 10 ;
	protected float error = 0 , h , x , y ;

	public void Cal ()
	{
		int n = 10 ;
		int i ;

		x = 0.5f ;/*x 座標位置*/
		h = 1f ;/* h 初始值*/
		for (i = 1; i <= n; i++)
		{
			h = 0.25f * h ;/* 使h值一直變小*/
			y = (float) ( ( Math.cosh( x + h ) - Math.cosh( x ) ) / h ) ;/*目標之方程式*/
			error = (float) Math.abs( Math.sinh( x ) - y ) ;/*誤差項*/
			System.out.println( "y = " + y + "  error = " + error + " h = " + h ) ;
		}

	}

}
