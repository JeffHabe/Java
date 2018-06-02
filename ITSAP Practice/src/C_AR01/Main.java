package C_AR01;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
import java.util.StringTokenizer; 
 
public class Main { 
 
 
 
    public static void main(String[] args) throws IOException { 
        InputStreamReader inSR=new InputStreamReader(System.in); 
       BufferedReader br= new BufferedReader(inSR); 
       String str = br.readLine(); 
        StringTokenizer st=new StringTokenizer(str); 
       String[] a=new String[40]; 
     int n =0; 
      while(st.hasMoreTokens()){ //能判別 /n 這樣才就可以直接輸入 20 53 65 18 會連空白都讀進去
         a[n]=st.nextToken(); 
           n++; 
       } 
        for (int i = n-1;i>=0;i--){
        	if(i==n-1){
        		System.out.print(a[i]);
        	}else
             System.out.print(" "+a[i]); 
           } 
        System.out.println();
    }
  } 
 