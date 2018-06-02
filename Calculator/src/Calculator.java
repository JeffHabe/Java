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
		 * 輸入字串分析
		 * 輸入的字串可以不用 符號跟數字分隔
		 */
		 
		str = scanner.nextLine();
		 
		symbol =String.valueOf(str.charAt(0));
		// 只拿字串第一個位置,取出符號
		StringTokenizer stk = new StringTokenizer(str, symbol);
		//判別是為要顯示結果
		if(symbol.equals("r")|| symbol.equals("R")){
			System.out.println("Final result = "+ result );
			onExit();//進了判定結束方法
		}else{
		inputNum = Double.parseDouble(stk.nextToken());//取出符號後的數字
		symbol();
		}
	}

	public static void symbol() {
		try {
			if (symbol.equals("+")==false  &&  //判定是是不是個+-*/符號以外的
				symbol.equals("-")==false  && 
				symbol.equals("*")==false && 
				symbol.equals("/")==false ) {
				throw new UnknownOperatorException(symbol + "is an unknown operator");//掉出Exception 並進入UnknownOperatorException 
			} else {
				if (symbol.compareTo("+") == 0){
					add(inputNum);//進入運算方法
					toShow();	//顯示運算過程與新的result 結果
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
		} catch (UnknownOperatorException ex) {//catch the UnknownOperator Excepthion 後顯示錯誤訊息
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
			throw new DivisionByZeroException();//掉出Exception 
			}
		result = result / inputNum;
		toShow();
		}catch(DivisionByZeroException e){
			System.out.println(e.getMessage());
			System.out.println("reenter your last line:");
		}
		
	}
//顯示運算後的結果
	
	public static void toShow() {
		System.out.println("result " + symbol + " " + inputNum + " = " + result);
		System.out.println("new result = " + result);

	}
	//判斷結束的方法
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
