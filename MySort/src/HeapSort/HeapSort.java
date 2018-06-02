package HeapSort;

import loader.SortAbstract;

public class HeapSort  extends SortAbstract{
	
	private int[] hpArray;
	private int N;
	
	public HeapSort(){
		
	}
	public  HeapSort(int N){
		 hpArray=new int[N+1];
	}
	

	public void insert(int x) {
		hpArray[++N] = x;
//		swim(N);
	}
	
//	private void swim(int k) {
//		while (k > 1 && less(k / 2, k)) {
//			exch(hpArray,k, k / 2);
//			k = k / 2;
//		}
//	}
	
	private static void sink(int [] a, int k, int N) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(a[j], a[j + 1]))
				j++;
			if (!less(a[k],a[j]))
				break;
			exch(a, k, j);
			k = j;
		}
	}
	private static boolean less(Integer v, Integer w) {
		return (v.compareTo(w) < 0);
	}

	private static void exch(int[] array, int i, int j) {
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}

	public int[] MySort(int[] array) {
		int N = array.length;
		HeapSort hpsort = new HeapSort(N);
		for (int i = 0; i < N; i++)
			hpsort.insert(array[i]);
		System.out.println("HeapSort Arrays ");
		for (int i = 0; i < N; i++)	
			System.out.print(hpsort.hpArray[i+1]+" ");
		System.out.println();
		
		for (int k = N / 2; k >= 1; k--)
			sink(hpsort.hpArray, k, N);
		
		System.out.println("HeapSort Sinked ");
		for (int i = 0; i < N; i++)	
			System.out.print(hpsort.hpArray[i+1]+" ");
		
		System.out.println();
		
		while (N > 1) {
			exch(hpsort.hpArray, 1, N);
			sink(hpsort.hpArray, 1, --N);
		}
		
		
		for(int i=1;i<hpsort.hpArray.length;i++){
			array[i-1]=hpsort.hpArray[i];
		}
		return array;
	}

	
	public static void main(String[] args) {
		int[] intArray = { 1,3,7,2,6,3,7,9, };
		// test array
		System.out.println("Unorded array:");
		for (int element : intArray)
			System.out.print(element + " ");
		System.out.println();
	
		HeapSort sort = new HeapSort();
		sort.MySort(intArray);

		System.out.println("Sorted array:");
		for (int element : intArray)
			System.out.print(element + " ");
		System.out.println();
	}


}
