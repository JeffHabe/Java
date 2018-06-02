package C_AR02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		         String s=new String() ; 
		        int[] i = new int[6]; 
		       int j=0;
		     while(j<6){ 
		    	 i[j]=new Scanner(System.in).nextInt();
		           s=i[j]+" "+s;
		           j++;
		        } 
		      
		   System.out.print(s); 
		      
		   System.out.println();
		  } 
		
		} 


