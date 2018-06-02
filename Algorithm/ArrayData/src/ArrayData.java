import java.util.Random;
import java.util.Scanner;
//avg(A);
//reverse(A);
//shuffle(A);
//toString(A);
//inner_product(double[] B
//);
public class ArrayData {
    private final double Test_Array[];
    public static Scanner scr = new Scanner(System.in);

    public ArrayData(double[] A) {
        this.Test_Array = A;
    }

    public void setArray() {
//        throw new UnsupportedOperationException("Not supported yet.");

        for (int i = 0; i < Test_Array.length; i++) {
            Test_Array[i] = scr.nextDouble();
        }//To change body of generated methods, choose Tools | Templates.
    }

    public double max() {

        double temp = Test_Array[0];
        for (int i = 0; i < Test_Array.length; i++) {
            if (temp < Test_Array[i]) {
                temp = Test_Array[i];
            }
        }
        double ary_Max = temp;
        return ary_Max;
    }

    public double avg() {

        double sum = Test_Array[0];
        for (int i = 0; i < Test_Array.length; i++) {
            sum += Test_Array[i];
        }
        double ary_Avg = sum / Test_Array.length;
        return ary_Avg;
    }

    public void reverse(double A[]) {

        for (int i = 0; i < A.length / 2; i++) {
            double temp = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = temp;
        }
    }
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		   double Ary[] = new double[scr.nextInt()];
	        ArrayData A = new ArrayData(Ary);
	        double ans_Max;
	        double ans_Avg;
	        A.setArray();
	        ans_Max = A.max();
	        ans_Avg = A.avg();
	        A.reverse(Ary);

	        System.out.println("The Maxium value in Array is " + ans_Max);
	        System.out.println("The Average value in Array is " + ans_Avg);
	        System.out.println(Ary);
	}

}