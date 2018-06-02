package JEFF.MACAU.AES;
import JEFF.MACAU.AES.AESAlgorithm;
public class AESGO {


	public static void main(String[] args) {
	
//		  <p>Title: The Cipher Library</p>
//		  <p>Description: The AESAlgorithm is designed for encrypting and decripting using AES Algorithm </p>
//		  <p>Example: </p>
//		  <pre>
		  AESAlgorithm alg = new AESAlgorithm(AESAlgorithm.KEY_SIZE_128); // up to 4096
		  byte[] bytesKey = alg.createKey();
	
//		  for(int i = 1 ;i<= bytesKey.length;i++){
//			  if(i%4==0){
//				  System.out.print(bytesKey[i-1]+ "\n");
//			  }else{
//				  System.out.print(bytesKey[i-1]+ " ");
//			  }
//		  }
//		  System.out.println();
//		  System.out.println("===================");
		  
		  int[] wordsKeyExpansion = alg.createKeyExpansion(bytesKey);
//		  for(int i = 1 ;i<= wordsKeyExpansion.length;i++){
//			  if(i%4==0){
//				  System.out.print(wordsKeyExpansion[i-1]+ "\n");
//			  }else{
//				  System.out.print(wordsKeyExpansion[i-1]+ "  ");
//			  }
//		  }
//		  
//		  System.out.println();
//		  System.out.println("===================");
		  String strMessage = "this is a test";
		  byte[] bytesMessage = strMessage.getBytes();
		  byte[] bytesEncrypted = alg.cipher(bytesMessage, wordsKeyExpansion);
//		  System.out.println("Encrypted= " + new String(bytesEncrypted) );
//		  System.out.println("===================");
//		  System.out.println("===================");
//		  System.out.println("===================");
//		  System.out.println("===================");
		  byte[] bytesDecrypted = alg.invCipher(bytesEncrypted, wordsKeyExpansion);

//		  System.out.println("Decrypted= " + new String(bytesDecrypted) );
	}

}
