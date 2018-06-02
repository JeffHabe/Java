package jna;


public class JavaCallCppTest
{

	public static void main ( String[] args )
	{
		JavaCallCppService lib = JavaCallCppService.INSTANCE;
		System.out.println( lib.add( 1 , 2 ) );
		JavaCallCppService.INSTANCE.hello();
	}

}
