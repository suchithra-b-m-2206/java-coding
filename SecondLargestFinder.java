public class SecondLargestFinder {

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {10, 5, 8, 20, 15};
        int[] array2 = {50, 40, 30, 20, 10};

        System.out.println("Second largest number in array1: " + findSecondLargest(array1));
        System.out.println("Second largest number in array2: " + findSecondLargest(array2));
    }

    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] array) {
        // Initialize variables to hold the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                // Update second largest before updating largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // Update second largest if num is between largest and second largest
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
