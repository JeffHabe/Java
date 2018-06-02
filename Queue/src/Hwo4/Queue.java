package Hwo4;

import java.util.Scanner;

import loader.QueueAb;

public class Queue extends QueueAb {
	private int[] s;
	private int N = 0;
	private int O = 0;
	static Scanner scr = new Scanner(System.in);

	public Queue() {
		s = new int[1];
	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Queue qe = new Queue();
		System.out.print("輸入測試次數 n :");
		int cnt = scr.nextInt();
		for (int i = 0; i < cnt; i++) {
			qe.Enqueue(scr.nextInt());
		}
			System.out.println(qe.Dequeue());
			cnt--;
			qe.Enqueue(594);
			cnt++;
			System.out.println(qe.Dequeue());
			cnt--;
			qe.Enqueue(8089);
			cnt++;
			for (int i = 0; i <cnt ; i++) {
				System.out.println(qe.Dequeue());
			}
	}
	@Override
	public void Enqueue(int element) {
		if (N == s.length)
			resize(2 * s.length);
		s[N++] = element;

	}

	@Override
	public int Dequeue() {
		int item = s[O];
		s[O++] = 0;

		if (N > 0 && N == s.length / 4)
			resize(s.length / 2);
		return item;
	}

	private void resize(int capacity) {
		int[] copy = new int[capacity];
		for (int i = 0; i < N; i++) {
			copy[i] = s[i];
		}
		s=null;
		s = copy;
	}
}
