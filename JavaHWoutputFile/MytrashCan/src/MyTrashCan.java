
import java.util.Random;

import loader.TrashCanAb;

public class MyTrashCan extends TrashCanAb {

    int[] trash = new int[3000];
	private int num = 0;



    public static void main(String[] args) {
    }

    @Override
    public void Insert(int garbage) {
        trash[trash.length - 1 - num] = garbage;
        num++;
    }

    @Override
    public void Empty() {
        for (int i = 0; i < trash.length; i++) {
            trash[i] = 0;
        }
    }

    @Override
    public String ToString() {
        String str = Integer.toString(trash[trash.length - num]);
        //String str2 = Integer.toString(trash[trash.length - 1]);
        for (int i = trash.length - num + 1; i < trash.length; i++) {
            str = str + "," + Integer.toString(trash[i]);
        }
        str = "[" + str + "]";
        return str;
    }

}
