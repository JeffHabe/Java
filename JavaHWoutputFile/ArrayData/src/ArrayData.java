
import java.util.Arrays;
import java.util.Random;
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
public class ArrayData {
//        avg(A);
//        reverse(A);
//        shuffle(A);
//        toString(A);
//        inner_product(double[] B)
// 

    private final double Test_Array[];

    public ArrayData(double[] A) {
        this.Test_Array = A;
        setArray();
        /* 先輸入陣列的值*/

    }

    private void setArray() {
//        throw new UnsupportedOperationException("Not supported yet.");
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < Test_Array.length; i++) {
            Test_Array[i] = scr.nextDouble();
        }//To change body of generated methods, choose Tools | Templates.
    }

    public double max() {
        /* 計算Array最大值*/

        double temp = Test_Array[0];
        for (int i = 0; i < Test_Array.length; i++) {
            if (temp < Test_Array[i]) {
                temp = Test_Array[i];
            }
        }
        double ary_Max = temp;
        System.out.println("The Maxium value in Array is " + ary_Max);
        return ary_Max;
    }

    public double avg() {/* 計算Array 平均值*/

        double sum = Test_Array[0];
        for (int i = 0; i < Test_Array.length; i++) {
            sum += Test_Array[i];
        }
        double ary_Avg = sum / Test_Array.length;
        System.out.println("The Average value in Array is " + ary_Avg);
        return ary_Avg;

    }

    public void reverse() {/* 把Array 排序顛倒*/
 /*前後顛倒迴圈只需跑陣列的一半*/
        for (int i = 0; i < Test_Array.length / 2; i++) {
            double temp = Test_Array[i];
            Test_Array[i] = Test_Array[Test_Array.length - 1 - i];
            Test_Array[Test_Array.length - 1 - i] = temp;
        }
        System.out.print("Reverse: ");
        System.out.println(Arrays.toString(Test_Array));
    }

    public void shuffle() {/* 把ARRAY 排序打亂*/
        Random rnd = new Random(Test_Array.length);
        for (int i = 0; i < Test_Array.length; i++) {/*洗牌*/
            int inDex = rnd.nextInt(Test_Array.length - 1);
            double temp = Test_Array[i];
            Test_Array[i] = Test_Array[inDex];
            Test_Array[inDex] = temp;
        }
        System.out.print("Shuffle: ");
        System.out.println(Arrays.toString(Test_Array));
    }

    public double inner_product(double[] B) {/* 計算雙Array 的內積*/
        if (B.length == Test_Array.length) {
            double dot = 0;
            for (int i = 0; i < Test_Array.length; i++) {
                dot += Test_Array[i] * B[i];
            }
            System.out.println("內積結果為: " + dot);
            return dot;
        } else {
            System.out.println("陣列維度不符");
            return 0;
        }

    }
}
