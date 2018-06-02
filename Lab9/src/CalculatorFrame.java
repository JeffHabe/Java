
import javax.swing.*;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorFrame extends Calculator implements ActionListener{
			
	private JFrame frame ;
	private String[] name;
	public static final int WIDTH=500;
	public static final int HEIGHT=400;
	final int NUMBER_OF_DIGITS=30;
	public boolean FRIST_TIME=true;
	static boolean loop=true;
	
	public static  String inputStr="";
	JTextField ioField , resultField;
	JButton[] btn=new JButton[18];
	
	public CalculatorFrame() {      //這建構子,為了預設按鈕上的文字
		frame = new JFrame();
        String n[] = {"Input   : ", 
                      "Result : ", 
                      "7", //0
                      "8", //1
                      "9", //2
                      "/", //3
                      "4", //4
                      "5", //5
                      "6", //6
                      "*", //7
                      "1", //8
                      "2", //9
                      "3", //10
                      "-", //11
                      "=",//12
                      "0", //13
                      ".", //14
                      "+", //15
                      "CE",//16
                      "sqrt"};//17
        name = n;
        runGUI();
	}
	public void runGUI(){

		frame.setSize(WIDTH,HEIGHT);
		frame.setTitle("Calculator");
//		frame.setLayout(new GridLayout(6,10));
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		/*
		 * 使用GridBagConstraints 
		 * GridBagConstraints 類別 (class) 為 GridBagLayout 的常數設定類別，
		 * 這是說將 Frame 設定為 GridBagLayout 後，
		 * 需要另外替每個要加入 Frame 的元件建立 GridBagConstraints 物件設定相關常數，
		 * 在 Frame 呼叫 add() 之時同時提供 GridBagConstraints 物件當參數。

		 */
		JLabel n0 = new JLabel(name[0]);   
        GridBagConstraints c0 = new GridBagConstraints();
        c0.gridx = 0;
        c0.gridy = 0;
        c0.gridwidth = 1;
        c0.gridheight = 1;
        c0.weightx = 0;
        c0.weighty = 0;
        c0.fill = GridBagConstraints.NONE;
        c0.anchor = GridBagConstraints.WEST;
        frame.add(n0, c0);
         
     
        
        ioField= new JTextField("Enter numbers here.",NUMBER_OF_DIGITS);
        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 1;
        c1.gridy = 0;
        c1.gridwidth = 10;
        c1.gridheight = 1;
        c1.weightx = 0;
        c1.weighty = 0;
        c1.fill = GridBagConstraints.BOTH;
        c1.anchor = GridBagConstraints.WEST;
        frame.add(ioField, c1);
                  
        JLabel n1 = new JLabel(name[1]);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.gridx = 0;
        c2.gridy = 1;
        c2.gridwidth = 1;
        c2.gridheight = 1;
        c2.weightx = 0;
        c2.weighty = 0;
        c2.fill = GridBagConstraints.NONE;
        c2.anchor = GridBagConstraints.WEST;
        frame.add(n1, c2);
         
        resultField= new JTextField("0.0");
        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 1;
        c3.gridy = 1;
        c3.gridwidth = 10;
        c3.gridheight = 1;
        c3.weightx = 0;
        c3.weighty = 0;
        c3.fill = GridBagConstraints.BOTH;
        c3.anchor = GridBagConstraints.WEST;
        frame.add(resultField, c3);
        
        btn[16] = new JButton(name[19]);
        btn[16].setActionCommand(name[19]);
        btn[16].addActionListener(this);
        GridBagConstraints c5 = new GridBagConstraints();
        c5.gridx = 0;
        c5.gridy = 2;
        c5.gridwidth = 1;
        c5.gridheight =2;
        c5.weightx = 0;
        c5.weighty = 0;
        c5.fill = GridBagConstraints.BOTH;
        c5.anchor = GridBagConstraints.CENTER;
        frame.add(btn[16], c5);
        
        btn[17] = new JButton(name[18]);
        btn[17].setActionCommand(name[18]);
        btn[17].addActionListener(this);
        GridBagConstraints c6 = new GridBagConstraints();
        c6.gridx = 0;
        c6.gridy = 4;
        c6.gridwidth = 1;
        c6.gridheight =2;
        c6.weightx = 1;
        c6.weighty = 1;
        c6.fill = GridBagConstraints.BOTH;
        c6.anchor = GridBagConstraints.CENTER;
        frame.add(btn[17], c6);
     
        /*
         * 設定0~9和運算符號的按鈕
         */
        int num =0;
        for (int row = 0; row <4; row++) {
        	  for (int col= 0; col < 4; col++) {
		            btn[num] = new JButton(name[num + 2]);
		            btn[num].setActionCommand(name[num+2]);
		            btn[num].addActionListener(this);
		            GridBagConstraints c7 = new GridBagConstraints();
		            c7.gridx = col+1;
		            c7.gridy = 2+row;
		            c7.gridwidth = 1;
		            c7.gridheight = 1;
		            c7.weightx = 1;
		            c7.weighty = 1;
		            c7.fill = GridBagConstraints.BOTH;
		            c7.anchor = GridBagConstraints.CENTER;
		            frame.add(btn[num], c7);
		            num++;
	        		
        		  
	        }
        }
        frame.setVisible(true);
	}
	
	
	
	protected void setioField(){
		ioField.setText(inputStr);
		inputNum=Double.parseDouble(inputStr);
		this.FRIST_TIME=false;
		
	}
	public String getioField(){
		return ioField.getText().toString();
	}
	public void setresultField(String result){
		resultField.setText(result);
		cleanIOField();
	}
	public String getresultField(){
		return resultField.getText().toString();
	}
	
	public static void main(String[] args) {
		/*
		 * 啟動GUI 並無限執行
		 */
		CalculatorFrame calGUI= new CalculatorFrame();
		while(loop){
			if(!calGUI.FRIST_TIME){
			Calculator.getinputNum(inputStr);
			}
		}
	}
	/*
	 * 實作Override 方法
	 * 目的為了給每一個按鈕被按下時執行的動作
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
	String cmd = e.getActionCommand();
	switch (cmd){
		case "1":
			inputStr+="1";
			setioField();
			break;
		case "2":
			inputStr+="2";
			setioField();
			break;
		case "3":
			inputStr+="3";
			setioField();
			break;		
		case "4":
			inputStr+="4";
			setioField();
			break;
		case "5":
			inputStr+="5";
			setioField();
			break;
		case "6":
			inputStr+="6";
			setioField();
			break;
		case "7":
			inputStr+="7";
			setioField();
			break;
		case "8":
			inputStr+="8";
			setioField();
			break;
		case "9":
			inputStr+="9";
			setioField();
			break;
		case "0":
			inputStr+="0";
			setioField();
			break;
		case ".":
			inputStr+=".";
			setioField();
			break;
		case "+":
			symbol(cmd);
			setResult();
			cleanIOField();
			break;
		case "-":
			symbol(cmd);
			setResult();
			cleanIOField();
			break;
		case "*":
			symbol(cmd);
			setResult();
			cleanIOField();
			break;
		case "/":
			symbol(cmd);
			if(inputNum == 0){
				ioField.setText(exception);
			}else{
			setResult();
			cleanIOField();
			}
			break;
		case "CE":
			symbol(cmd);
			setResult();
			cleanIOField();
			break;
		case "sqrt":
			symbol(cmd);
			setResult();
			cleanIOField();
			break;
		case "=":
			symbol(cmd);
			setResult();
			cleanIOField();
			break;														
		}
	}
	/*
	 * 為了重置input TextField
	 */
	public void cleanIOField(){
		ioField.setText("0.0");
		inputStr ="";
		inputNum=0;
	}
	/*
	 * 為了輸出結果到resultField 上
	 */
	public void setResult(){
		resultField.setText(Double.toString(result));
	}
	
}
