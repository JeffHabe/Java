
public class test
{

	public static void main ( String[] args )
	{
		int k =5;//k是變數，可以透過改變k值print出不同邊長的方形，這次作業是5*5的圖形故k=5
		int r= 2*k*k*k-3*k*k+k;//r是加總公式，因為發現圖形的左下角是平方和。
		
		
	
		 {
				
				for(int a=1;a<=k;a++)//For迴圈a從1跑到k。
				  {
				     for(int b=1;b<=k;b++){//For迴圈b從1跑到k
				    	 if(a<=b)//如果a<=b
				System.out.print("*");	//print出"*"
				     }
			
				     for(int b=1;b<=k;b++)//For迴圈b從1跑到k
					   		 if(b<a)//如果b<a
					   		
					System.out.print(k+b-a);//print出k+b-a
				   
				     System.out.println();	}//換行
	   		
					System.out.print(r/6)	;//print出右下角三角形內數字的總和						 
				     

				
					  
			
		 }
	}
}

