package Sort;

import loader.SortAbstract;

public class SelectionSort extends SortAbstract {
	
	
	private static boolean less(Comparable v,Comparable w) 
	{return (v.compareTo(w) < 0);}

	private static void exch(int[] array, int i, int j) {
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}

	public static void main(String[] args) {
		int[] intArray = {1,4,2,3,5};
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
		int N = array.length;
		for (int i = 0; i < N; i++)
		{
		int min = i;
		for (int j = i+1; j < N; j++)
			if (less(array[j], array[min]))
				min = j;
				exch(array, i, min);
		}

	return array;

	}
}

