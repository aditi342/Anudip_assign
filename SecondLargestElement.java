//Write a Java function to find the second-largest element in an array of integers. The function should return the second-largest element.

public class SecondLargestElement {
        
    public static void main(String[] args) {
        int[] arr = { 100, 220, 94, 5, 1 };

		int firstLargest = 0;
		int secondLargest = 0;

		for (int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}
		}

		System.out.println("The second largest element is: " + secondLargest);
    }
}
