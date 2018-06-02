import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {
	protected static Scanner scanner = new Scanner(System.in);
	private static double result = 0.0;
	public static double inputNum = 0.0;
	public static String symbol = "";
	static String str = "";
	private static boolean loop = true; 

	public static void setinputNum() {
		/*
		 * ��J�r����R
		 * ��J���r��i�H���� �Ÿ���Ʀr���j
		 */
		 
		str = scanner.nextLine();
		 
		symbol =String.valueOf(str.charAt(0));
		// �u���r��Ĥ@�Ӧ�m,���X�Ÿ�
		StringTokenizer stk = new StringTokenizer(str, symbol);
		//�P�O�O���n��ܵ��G
		if(symbol.equals("r")|| symbol.equals("R")){
			System.out.println("Final result = "+ result );
			onExit();//�i�F�P�w������k
		}else{
		inputNum = Double.parseDouble(stk.nextToken());//���X�Ÿ��᪺�Ʀr
		symbol();
		}
	}

	public static void symbol() {
		try {
			if (symbol.equals("+")==false  &&  //�P�w�O�O���O��+-*/�Ÿ��H�~��
				symbol.equals("-")==false  && 
				symbol.equals("*")==false && 
				symbol.equals("/")==false ) {
				throw new UnknownOperatorException(symbol + "is an unknown operator");//���XException �öi�JUnknownOperatorException 
			} else {
				if (symbol.compareTo("+") == 0){
					add(inputNum);//�i�J�B���k
					toShow();	//��ܹB��L�{�P�s��result ���G
				}else if (symbol.compareTo("-") == 0){
						subtract(inputNum);
						toShow();
				}else if (symbol.compareTo("*") == 0){
						multiply(inputNum);
						toShow();
				}else if (symbol.compareTo("/") == 0){
							divide(inputNum);
							
				}
			}
		} catch (UnknownOperatorException ex) {//catch the UnknownOperator Excepthion ����ܿ��~�T��
			System.out.println(ex.getMessage());
			System.out.println("reenter your last line:");
		}
	}

	public static void add(double inputNum) {
		result += inputNum;

	}

	public static void subtract(double inputNum) {
		result -= inputNum;
	}

	public static void multiply(double inputNum) {
		result = result * inputNum;
	}

	public static void divide(double inputNum) {
		try{	
		if(inputNum==0){
			throw new DivisionByZeroException();//���XException 
			}
		result = result / inputNum;
		toShow();
		}catch(DivisionByZeroException e){
			System.out.println(e.getMessage());
			System.out.println("reenter your last line:");
		}
		
	}
//��ܹB��᪺���G
	
	public static void toShow() {
		System.out.println("result " + symbol + " " + inputNum + " = " + result);
		System.out.println("new result = " + result);

	}
	//�P�_��������k
	public static void onExit(){
		System.out.println("Again? (y/n)");
		String ck = scanner.nextLine();
		if(ck.equals("n")||ck.equals("N")){
			loop=false;
		}else{
			loop=true;
			System.out.println("result : " + result);
		}
	}

	public static void main(String[] args) {

		System.out.println("Calculator is on.");
		System.out.println("result : " + result);
		while (loop) {
			setinputNum();
		}
		System.out.println("Bye Bye");
		scanner.close();
	}
}
