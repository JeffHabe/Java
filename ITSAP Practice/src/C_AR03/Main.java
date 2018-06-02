package C_AR03;

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
       Integer[] a=new Integer[6]; 
       
       for(int n =0;n<6;n++){ 
          a[n]=Integer.parseInt(st.nextToken()); 
       }  
       int sum=0;
       for (int i = 0;i<6;i++){ 
            sum += Math.pow(a[i], 3); 
       }
       System.out.print(sum);	
    }
       
  } 
  


