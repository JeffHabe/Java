

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
		 * ��J�r����R
		 * ��J���r��i�H���� �Ÿ���Ʀr���j
		 */
		inputNum=Double.parseDouble(str);
		//�bioField ������r���A����DOUBLE 
		}
	

	public static void symbol(String inputSym) {
		setSymbol(inputSym);
		
		try {
			if (getSymbol().equals("+")==false  &&  //�P�w�O�O���O��+-*/�Ÿ��H�~��
				getSymbol().equals("-")==false  && 
				getSymbol().equals("*")==false && 
				getSymbol().equals("/")==false &&
				getSymbol().equals("sqrt")==false &&
				getSymbol().equals("=")==false &&
				getSymbol().equals("CE")==false 
				) {
				throw new UnknownOperatorException(getSymbol() + "is an unknown operator");//���XException �öi�JUnknownOperatorException 
			} else {
				if (getSymbol().compareTo("+") == 0){
						add();	//�i�J�B���k
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
		} catch (UnknownOperatorException ex) {//catch the UnknownOperator Exception ����ܿ��~�T��
//			System.out.println(ex.getMessage());
//			System.out.println("reenter your last line:");
		}
		lastSymbol=inputSym;
	}

	private static void reset() {
		result =0;
		setSymbol("");
		
	}


	private static void calResult() {// �p�G�̫��"=" ��,���F����̫�@�ӳQ���L���B��Ÿ�
		if (lastSymbol.compareTo("+") == 0){
			add();	//�i�J�B���k
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
			throw new DivisionByZeroException();//���XException 
			}
		result = result / inputNum;
		setSymbol("");
		
		}catch(DivisionByZeroException e){
			exception =e.getMessage();
		}
		
	}
//��ܹB��᪺���G
	

	//�P�_��������k


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

