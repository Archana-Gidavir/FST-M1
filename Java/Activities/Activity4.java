package fsthello;

import java.util.Arrays;

public class Activity4 {
	public static void main(String[] array) {
		int[] data = { 9, 5, 1, 4, 3 };
		
		System.out.println("Original Array : " + Arrays.toString(data));
		insertionSort(data);
        System.out.println("Final Sorted Array in Ascending Order: " + Arrays.toString(data));
		
	}
	
	public static void insertionSort(int[] test) {
		int i, arraysize=test.length;
		
		for (i=0; i < arraysize-1; i++) {
			int key = test[i+1];
            int j = i;
            
            while (j >= 0 && key < test[j]) {
            	test[j+1] = test[j];
                --j;
            }
            test[j+1] = key;
            System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(test));
		}
	}

}
