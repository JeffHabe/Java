package jna;

import com.sun.jna.Library ;
import com.sun.jna.Native ;

public interface JavaCallCppService extends Library
{
	JavaCallCppService INSTANCE = (JavaCallCppService)Native.loadLibrary( "demo", JavaCallCppService.class);
	public int add(int a,int b);
	public void hello();
}
