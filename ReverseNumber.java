public class ReverseNumber {
    public static int reverse(int number) {
        int reversedNumber = 0;
        int sign = number < 0 ? -1 : 1; // Preserve the sign
        number = Math.abs(number); // Work with the absolute value of the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        
        return reversedNumber * sign; // Apply the original sign to the reversed number
    }
    public static void main(String[] args) {
        int input1 = 12345;
        int input2 = -67890;
        
        System.out.println("Input: " + input1);
        System.out.println("Output: " + reverse(input1));
        
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + reverse(input2));
    }
}
