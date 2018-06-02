

public class Calculator {
	
	public static double result = 0.0;
	public static double inputNum = 0.0;
	private static String symbol = "";
	static String str = "";
	public static boolean loop = true; 
	public static String exception ="";
	public static String lastSymbol="";
	public static void getinputNum(String str) {
		/*
		 * 輸入字串分析
		 * 輸入的字串可以不用 符號跟數字分隔
		 */
		inputNum=Double.parseDouble(str);
		//在ioField 中取後字串後再換成DOUBLE 
		}
	

	public static void symbol(String inputSym) {
		setSymbol(inputSym);
		
		try {
			if (getSymbol().equals("+")==false  &&  //判定是是不是個+-*/符號以外的
				getSymbol().equals("-")==false  && 
				getSymbol().equals("*")==false && 
				getSymbol().equals("/")==false &&
				getSymbol().equals("sqrt")==false &&
				getSymbol().equals("=")==false &&
				getSymbol().equals("CE")==false 
				) {
				throw new UnknownOperatorException(getSymbol() + "is an unknown operator");//掉出Exception 並進入UnknownOperatorException 
			} else {
				if (getSymbol().compareTo("+") == 0){
						add();	//進入運算方法
				}else if (getSymbol().compareTo("-") == 0){
						subtract();

				}else if (getSymbol().compareTo("*") == 0){
						multiply();

				}else if (getSymbol().compareTo("/") == 0){
						divide();
						
				}else if (getSymbol().compareTo("sqrt") == 0){
						sqrt();
						
				}else if (getSymbol().compareTo("=") == 0){
						calResult();
						
				}else if (getSymbol().compareTo("CE") == 0){
						reset();
						
				}
			}
		} catch (UnknownOperatorException ex) {//catch the UnknownOperator Exception 後顯示錯誤訊息
//			System.out.println(ex.getMessage());
//			System.out.println("reenter your last line:");
		}
		lastSymbol=inputSym;
	}

	private static void reset() {
		result =0;
		setSymbol("");
		
	}


	private static void calResult() {// 如果最後按"=" 時,為了執行最後一個被按過的運算符號
		if (lastSymbol.compareTo("+") == 0){
			add();	//進入運算方法
		}else if (lastSymbol.compareTo("-") == 0){
			subtract();

		}else if (lastSymbol.compareTo("*") == 0){
			multiply();

		}else if (lastSymbol.compareTo("/") == 0){
			divide();
			
		}else if (lastSymbol.compareTo("sqrt") == 0){
			sqrt();
					
		}

	}


	private static void sqrt() {
		result = Math.sqrt(result);
		
		setSymbol("");
		
	}


	public static void add() {
		result += inputNum;
		setSymbol("");
	}

	public static void subtract() {
		result -= inputNum;
		setSymbol("");
		
	}

	public static void multiply() {
		result = result * inputNum;
		setSymbol("");
	
	}

	public static void divide() {
		try{	
		if(inputNum==0){
			throw new DivisionByZeroException();//掉出Exception 
			}
		result = result / inputNum;
		setSymbol("");
		
		}catch(DivisionByZeroException e){
			exception =e.getMessage();
		}
		
	}
//顯示運算後的結果
	

	//判斷結束的方法


	public static void main(String[] args) {
//		 CalculatorFrame calGUI=new CalculatorFrame();
//		 while(loop){
//			 getinputNum(calGUI);	 
//		 }
		 

	}

	public static String getSymbol() {
		return symbol;
	}

	public static void setSymbol(String symbol) {
		Calculator.symbol = symbol;
	}
}

