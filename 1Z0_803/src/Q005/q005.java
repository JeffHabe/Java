package Q005;

public class q005 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int x=0;
		int y=0;
		do{//後判先執
			while(x++<3){//先判後執行
				System.out.print("x");
			}
			x=0;
		}while (y++ <2);
	}

}
