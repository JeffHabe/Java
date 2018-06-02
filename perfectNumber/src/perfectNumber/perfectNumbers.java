package perfectNumber;

import java.util.Scanner;

public class perfectNumbers {

	static Scanner scr = new Scanner(System.in);

	void showAns(int n, String str1[], String str2[]) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%-25s%-15s %n", str1[i], str2[i]);
			/* �L�X���G */
		}
	}

	int check_input() {
		int n;
		System.out.print("��J���զ��� n :");
		n = scr.nextInt();
		if (n <= 0 || n >= 10) {
			/* �P�_���զ��ƬO�b�d�� */
			System.out.print("���զ��ƶW�L�X�d��(0 < n < 10)");
			System.exit(0);
		}
		return n;
	}

	void checkpfNum(int n, String[] inStr, String[] outStr) {
		long p;
		int count = 0;
		while (count < n) {
			/* count �Ω�P�_�j��F����զ��ƫ�,�K�����j�� */
			long sum = 0;
			System.out.print("��J���խ� p :");
			p = scr.nextInt();/* ��Jp �� */
			if (p >= 1 || p <= (10 ^ 15)) {
				inStr[count] = Long.toString(p);
				/* ��p �ȩ�iinStr�r��}�C�� */
				for (int i = 1; i < p; i++) {
					int remainder = (int) p % i;
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
				System.out.print("���խȿ��~�Э��зs��J");
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
		String[] inStr = new String[n]; /* ��@�@��inStr ���r�ꪫ�� */
		String[] outStr = new String[n]; /* ��@�@��outStr ���r�ꪫ�� */
		pfnum.checkpfNum(n, inStr, outStr); /* ����pfnum���󤺪�checkpfNum��k-�Ω�P�_ */
		pfnum.showAns(n, inStr, outStr); /* ����pfnum���󤺪�showAns��k-�Ω�L�X���� */

	}

}
