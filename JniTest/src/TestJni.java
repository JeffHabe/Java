

public class TestJni
{
 public native boolean SetIPAddr(char IpAddStr );
 
 static
 {
	 System.loadLibrary( "MediumDll" );
 }
	

}
