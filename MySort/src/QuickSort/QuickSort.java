package QuickSort;

import SelectionSort.SelectionSort;
import loader.SortAbstract;

public class QuickSort extends SortAbstract {
	
	public static void shuffle(int[] a)
	{
	int N = a.length;
	for (int i = 0; i < N; i++)
	{
	int r = (int) (Math.random()*(i + 1));
	exch(a, i, r);
	}
	}
	
	private static boolean less(Integer v,Integer w) 
	{return (v.compareTo(w) < 0);}

	private static void exch(int[] array, int i, int j) {
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}

	public static void main(String[] args) {
		int[] intArray = {1,4,9,3,9,7,2,5};
        // test array
        System.out.println("Unsorted array:");
        for(int element: intArray)
             System.out.print(element + " ");
        System.out.println();
        
        SelectionSort sort=new SelectionSort();
        sort.MySort(intArray);

        System.out.println("Sorted array:");
        for(int element: intArray)
              System.out.print(element + " ");
        System.out.println();
	}

	public int[] MySort(int[] array) {
		
		shuffle(array);
		sort(array, 0, array.length - 1);

	return array;

	}
	private static int partition(int[] a, int lo, int hi)
	{
		int i = lo, j = hi+1;
		while (true){
			while (less(a[++i], a[lo]))
				if (i == hi) break;
			while (less(a[lo], a[--j]))
				if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
	return j;
	}
	private static void sort(int[] a, int lo, int hi)
	{
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
		}
}
