package perfectNumber02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class perfectNumbers {

	static Scanner scr = new Scanner(System.in);
	private int count;

	void showAns(int n, String str1[], String str2[]) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%-25s%-15s %n", str1[i], str2[i]);
			/* �L�X���G */
		}
	}

	int text_Input() {
		Scanner inputText = null;
		perfectNumbers pfnum = new perfectNumbers();
		try {
			inputText = new Scanner(new  FileInputStream("inFile.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}

		count = 0;
		
		
		while (inputText.hasNext()) {
			inputText.nextInt();
			count++;
		}
		String[] inStr = new String[count];
		String[] outStr = new String[count];
		pfnum.checkpfNum(count, inStr, outStr);
		inputText.close();
		
		return count;
	}
	void text_Output(String intStr[], String outStr[]) {
		PrintWriter outputText = null;
		try {
			outputText = new PrintWriter(new FileOutputStream("outFile.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		count = 0;
		while (count < intStr.length) {
			outputText.printf("%-25s%-15s %n", intStr[count], outStr[count]);
			count++;
		}
		outputText.close();
	}

	void checkpfNum(int n, String[] inStr, String[] outStr) {
		int count = 0;
		int p =0;
		Scanner inputText=null;
		try {
			inputText = new Scanner(new  FileInputStream("inFile.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		while (count < n) {
			/* count �Ω�P�_�j��F����զ��ƫ�,�K�����j�� */
			long sum = 0;
			
			/* ��Jp �� */
			
			p=inputText.nextInt();
			if (p >= 1 || p <= (10 ^ 15)) {
				inStr[count] = Integer.toString(p);
				/* ��p �ȩ�iinStr�r��}�C�� */
				for (int i = 1; i < p; i++) {
					int remainder = p % i;
					/* �ϥ�mod ��p �Ȫ��]�� */
					if (sum > p) {
						/* �P�_�b�j���٨S�����e, */
						outStr[count] = "nonperfect";/* sum �H�g�� p �Ȥj,�����j�� */
						break;
					}
					if (remainder == 0) {
						/* remainder =0 ,�]�l�ϲ֥[ */
						sum += i;
					}
				}
				if (sum == p) {
					/* p =sum ,��ܬO������ */
					outStr[count] = "perfect";
				} else {
					outStr[count] = "nonperfect";
				}
			} else {
				/* �ˬdP �O���O�b 0 < p < 10^15 ,��ܬO������ */
				outStr[count] = "���խȿ��~";
			}
			count++;
		
		}
		inputText.close();
	}

	public static void main(String[] args) {
		/*
		 * a=bc input consists first line of the input file contains an integer
		 * n (0<n<10) each test case consists of a positive integer p where
		 * (0<p<10^15) output contain one word in a line for each test case is
		 * perfect number ,show 'perfect' not 'nonperfect'
		 */
		perfectNumbers pfnum = new perfectNumbers();

		int n = pfnum.text_Input();
		String[] inStr = new String[n]; /* ��@�@��inStr ���r�ꪫ�� */
		String[] outStr = new String[n]; /* ��@�@��outStr ���r�ꪫ�� */
		pfnum.checkpfNum(n, inStr, outStr);
		pfnum.text_Output(inStr, outStr);
		; /* ����pfnum���󤺪�checkpfNum��k-�Ω�P�_ */
		pfnum.showAns(n, inStr, outStr); /* ����pfnum���󤺪�showAns��k-�Ω�L�X���� */

	}

}
