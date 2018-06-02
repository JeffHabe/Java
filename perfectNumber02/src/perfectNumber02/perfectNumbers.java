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
			/* 印出結果 */
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
			/* count 用於判斷迴圈達到測試次數後,便結束迴圈 */
			long sum = 0;
			
			/* 輸入p 值 */
			
			p=inputText.nextInt();
			if (p >= 1 || p <= (10 ^ 15)) {
				inStr[count] = Integer.toString(p);
				/* 把p 值放進inStr字串陣列內 */
				for (int i = 1; i < p; i++) {
					int remainder = p % i;
					/* 使用mod 找p 值的因數 */
					if (sum > p) {
						/* 判斷在迴圈還沒結束前, */
						outStr[count] = "nonperfect";/* sum 以經比 p 值大,結束迴圈 */
						break;
					}
					if (remainder == 0) {
						/* remainder =0 ,因子使累加 */
						sum += i;
					}
				}
				if (sum == p) {
					/* p =sum ,表示是完美數 */
					outStr[count] = "perfect";
				} else {
					outStr[count] = "nonperfect";
				}
			} else {
				/* 檢查P 是不是在 0 < p < 10^15 ,表示是完美數 */
				outStr[count] = "測試值錯誤";
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
		String[] inStr = new String[n]; /* 實作一個inStr 的字串物件 */
		String[] outStr = new String[n]; /* 實作一個outStr 的字串物件 */
		pfnum.checkpfNum(n, inStr, outStr);
		pfnum.text_Output(inStr, outStr);
		; /* 執行pfnum物件內的checkpfNum方法-用於判斷 */
		pfnum.showAns(n, inStr, outStr); /* 執行pfnum物件內的showAns方法-用於印出答案 */

	}

}
