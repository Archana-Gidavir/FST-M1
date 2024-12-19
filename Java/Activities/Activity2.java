package fsthello;

import java.util.Arrays;

public class Activity2 {
	public static void main(String[] args)
	{
		int[] testarray = {10, 77, 10, 54, -11, 10};
		
		int sum = 0;
		int searchNum = 10;
        int fixedSum = 30;
        
        System.out.println("Original Array: " + Arrays.toString(testarray));
        
        for (int number : testarray) {
            //check for 10
            if (number == searchNum) {
            	sum = sum + number;
            }
        }
        
        if (sum == fixedSum) {
        	System.out.println("Result True: " + sum + " equals to " + fixedSum);
        }
        else if (sum > fixedSum) {
        	System.out.println("Result False: " + sum + " more than " + fixedSum);
        }
        else {
        	System.out.println("Result False: " + sum + " less than " + fixedSum);
        }
        
        
        
        

	}
}
