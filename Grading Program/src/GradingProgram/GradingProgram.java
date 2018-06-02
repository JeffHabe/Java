package GradingProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import GradingProgram.Student;

public class GradingProgram {

	int text_Input() {
		Scanner inputText = null;
		int count;
		try {
			inputText = new Scanner(new FileInputStream("inFile3.txt"));
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

	void text_Output(Student[] st, int n) {
		int count = 0 ;
		GradingProgram gp = new GradingProgram();
		PrintWriter outputText = null;
		try {
			outputText = new PrintWriter(new FileOutputStream("outFile3.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		outputText.printf("%-8s%-8s%-8s%-8s%-10s%-8s%-15s%-15s%n","ID","Quize1","Quize2","Quize3",
				"Midterm","Final","NumericGrade","LetterGrade");
		while (count < n) {
			outputText.println(gp.ToString(st,count));
			count++;
		}
		outputText.close();
	}

	String ToString(Student[] st, int i) {
		String str = new String();
		String strFormat = "%-8s%5d%8d%8d%9d%8d%14d%12s";
		str = String.format(strFormat, st[i].getClassID(), st[i].getQuizzes()[0], st[i].getQuizzes()[1],
				st[i].getQuizzes()[2], st[i].getMidterm(), st[i].getFinalterm(), st[i].getOverallS(), st[i].getGrade());
		return str;
	}

	void getStValue(Student[] st, int n) {
		// TODO 自動產生的方法 Stub
		Scanner inputText = null;

		try {
			inputText = new Scanner(new FileInputStream("inFile3.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		for (int i = 0; i < n; i++) {
			st[i] = new Student();
			st[i].setClassID(inputText.next());
			st[i].setQuizzes(0, inputText.nextInt());
			st[i].setQuizzes(1, inputText.nextInt());
			st[i].setQuizzes(2, inputText.nextInt());
			st[i].setAvgQuiz();
			st[i].setMidterm(inputText.nextInt());
			st[i].setFinalterm(inputText.nextInt());
			st[i].setOverAllSc();
		}
		inputText.close();

	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		GradingProgram gp = new GradingProgram();

		int n = gp.text_Input();
		Student st[] = new Student[n];
		gp.getStValue(st, n);
		gp.CalGrade(st, n);
		gp.text_Output(st, n);
	}

	private void CalGrade(Student[] st, int n) {
		for (int i = 0; i < n; i++) {
			
			switch (st[i].getOverallS()/10) {
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
		}
	}

}
