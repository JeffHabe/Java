
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scrMain = new Scanner(System.in);
        System.out.println("請輸入 A 陣列大小: ");
        double Ary_A[] = new double[scrMain.nextInt()];
        ArrayData A = new ArrayData(Ary_A);

        System.out.println("請輸入 B 陣列大小: ");
        double Ary_B[] = new double[scrMain.nextInt()];
        ArrayData B = new ArrayData(Ary_B);
        double ans_dot = A.inner_product(Ary_B);

        A.reverse();
        System.out.print("原陣列: ");
        System.out.println(Arrays.toString(Ary_A));
        System.out.println("The Maxium value in Array is " + A.max());
        System.out.println("The Average value in Array is " + A.avg());
        System.out.print("Reverse: ");
        System.out.println(Arrays.toString(Ary_A));
        A.shuffle();
        System.out.print("Shuffle: ");
        System.out.println(Arrays.toString(Ary_A));

        B.shuffle();
        if (ans_dot == 0) {
            System.out.println("陣列維度不符");
        } else {
            System.out.println("內積結果為: " + ans_dot);
        }
    }
    
}
