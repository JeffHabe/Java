package perfectNumber;

import java.util.Scanner;

public class perfectNumbers {

	static Scanner scr = new Scanner(System.in);

	void showAns(int n, String str1[], String str2[]) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%-25s%-15s %n", str1[i], str2[i]);
			/* 印出結果 */
		}
	}

	int check_input() {
		int n;
		System.out.print("輸入測試次數 n :");
		n = scr.nextInt();
		if (n <= 0 || n >= 10) {
			/* 判斷測試次數是在範圍內 */
			System.out.print("測試次數超過出範圍(0 < n < 10)");
			System.exit(0);
		}
		return n;
	}

	void checkpfNum(int n, String[] inStr, String[] outStr) {
		long p;
		int count = 0;
		while (count < n) {
			/* count 用於判斷迴圈達到測試次數後,便結束迴圈 */
			long sum = 0;
			System.out.print("輸入測試值 p :");
			p = scr.nextInt();/* 輸入p 值 */
			if (p >= 1 || p <= (10 ^ 15)) {
				inStr[count] = Long.toString(p);
				/* 把p 值放進inStr字串陣列內 */
				for (int i = 1; i < p; i++) {
					int remainder = (int) p % i;
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
				System.out.print("測試值錯誤請重請新輸入");
			}
			count++;
		}
	}

	public static void main(String[] args) {
		/*
		 * a=bc input consists first line of the input file contains an integer
		 * n (0<n<10) each test case consists of a positive integer p where
		 * (0<p<10^15) output contain one word in a line for each test case is
		 * perfect number ,show 'perfect' not 'nonperfect'
		 */
		perfectNumbers pfnum = new perfectNumbers();
		int n = pfnum.check_input();
		String[] inStr = new String[n]; /* 實作一個inStr 的字串物件 */
		String[] outStr = new String[n]; /* 實作一個outStr 的字串物件 */
		pfnum.checkpfNum(n, inStr, outStr); /* 執行pfnum物件內的checkpfNum方法-用於判斷 */
		pfnum.showAns(n, inStr, outStr); /* 執行pfnum物件內的showAns方法-用於印出答案 */

	}

}
