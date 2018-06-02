package GradingProgramUsingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import GradingProgramUsingArrays.Student;

public class GradingProgramArrays {
	static String id[] = new String[50];
	static int quiz1[] = new int[50];
	static int quiz2[] = new int[50];
	static int quiz3[] = new int[50];
	static int midterm[] = new int[50];
	static int finalterm[] = new int[50];
	static int numericGrade[] = new int[50];
	static String letterGrade[] = new String[50];
	
	
	int text_Input() {//用來計算檔案有幾筆成績
		Scanner inputText = null;
		int count;
		try {
			inputText = new Scanner(new FileInputStream("inFile5.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}

		count = 0;
		while (inputText.hasNext()) {
			inputText.nextLine();
			count++;
		}

		inputText.close();
		return count;
	}
	public static void sort(int n ){ //排序
		int indexOfNextLargest;
		for(int i=0;i<n;i++){
			//Place the correct value in a[i];
			indexOfNextLargest = indexOfLargest(i,numericGrade,n);
			interchange(i,indexOfNextLargest,id);
			interchange(i,indexOfNextLargest,quiz1);
			interchange(i,indexOfNextLargest,quiz2);
			interchange(i,indexOfNextLargest,quiz3);
			interchange(i,indexOfNextLargest,midterm);
			interchange(i,indexOfNextLargest,finalterm);
			interchange(i,indexOfNextLargest,numericGrade);
			interchange(i,indexOfNextLargest,letterGrade);
			//a[0]>=a[1] >=.....a[i] and these are the Largest 
			// of the original array elements. the remaining positions 
			//contain the rest of the original array elements.
			
		}
	}
	private static void interchange(int i, int j, int[] a) {
		// TODO 自動產生的方法 Stub
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;//original value of a[i]
	}
	private static void interchange(int i, int j, String[] a) {
		// TODO 自動產生的方法 Stub
		String temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;//original value of a[i]
	}
	
	private static int indexOfLargest(int startIndex,int[] a ,int n){
		int max= a[startIndex];
		int indexOfMax=startIndex;
		for (int i=startIndex +1;i<n;i++ )
			if (a[i]>max){
				max = a[i];
				indexOfMax=i;
				//Max is Largest of a[starIndex] through a[i]
			}
			return indexOfMax;
	}
	void text_Output(Student[] st, int n) {
		int count = 0;
		GradingProgramArrays gp = new GradingProgramArrays();
		PrintWriter outputText = null;
		try {
			outputText = new PrintWriter(new FileOutputStream("outFile5.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		outputText.printf("%-8s%-8s%-8s%-8s%-10s%-8s%-15s%-15s%n", "ID", "Quize1", "Quize2", "Quize3", "Midterm",
				"Final", "NumericGrade", "LetterGrade");//用來顯示標題
		while (count < n) {
			outputText.println(gp.ToString(count));//輸出結果
			count++;
		}
		outputText.close();
	}
	// Lab#5 的輸出
	String ToString(int i) {
		String str = new String();
		String strFormat = "%-8s%5d%8d%8d%9d%8d%14d%12s";
		str = String.format(strFormat, id[i],quiz1[i],quiz2[i],quiz3[i],midterm[i]
				,finalterm[i],numericGrade[i],letterGrade[i]);
		//用出format 輸出的結果,用途是排版 
		return str;
	}
	// Lab#3 的輸出
	String ToString(Student[] st, int i) {
		String str = new String();
		String strFormat = "%-8s%5d%8d%8d%9d%8d%14d%12s";
		str = String.format(strFormat, st[i].getClassID(), st[i].getQuizzes()[0], st[i].getQuizzes()[1],
				st[i].getQuizzes()[2], st[i].getMidterm(), st[i].getFinalterm(), st[i].getOverallS(), st[i].getGrade());
		return str;
		//用出format 輸出的結果,用途是排版 
	}

	void getStValue(Student[] st, int n) {//用於從檔案取值
		// TODO 自動產生的方法 Stub
		Scanner inputText = null;
		
		try {
			inputText = new Scanner(new FileInputStream("inFile5.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		for (int i = 0; i < n; i++) {
			st[i] = new Student();
			st[i].setClassID(inputText.next());
			id[i] = st[i].getClassID();//為了把值放入Array 參數內;
			st[i].setQuizzes(0, inputText.nextInt());
			quiz1[i] = st[i].getQuizzes(0);
			st[i].setQuizzes(1, inputText.nextInt());
			quiz2[i] = st[i].getQuizzes(1);
			st[i].setQuizzes(2, inputText.nextInt());
			quiz3[i] = st[i].getQuizzes(2);
			st[i].setAvgQuiz();
			st[i].setMidterm(inputText.nextInt());
			midterm[i]=st[i].getMidterm();
			st[i].setFinalterm(inputText.nextInt());
			finalterm[i]=st[i].getFinalterm();
			st[i].setOverAllSc();
			numericGrade[i]=st[i].getOverallS();
		}
		inputText.close();

	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		GradingProgramArrays gp = new GradingProgramArrays();

		int n = gp.text_Input();
		Student st[] = new Student[n];
		gp.getStValue(st, n);
		gp.CalGrade(st, n);
		GradingProgramArrays.sort(n);
		gp.text_Output(st, n);
	}

	private void CalGrade(Student[] st, int n) {//計算LetterGrade
		for (int i = 0; i < n; i++) {

			switch (st[i].getOverallS() / 10) {
			case 10:
			case 9:
				st[i].setGrade("A");
				break;
			case 8:
				st[i].setGrade("B");
				break;
			case 7:
				st[i].setGrade("C");
				break;
			case 6:
				st[i].setGrade("D");
				break;
			default:
				st[i].setGrade("F");
			}
			letterGrade[i]=st[i].getGrade();
		}
	}

}
