public class DecimalToBinary {

    public static String decimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (number > 0) {
            int remainder = number % 2; // Get the remainder when dividing by 2
            binary.insert(0, remainder); // Prepend the remainder to the binary result
            number /= 2; // Divide the number by 2
        }
        
        return binary.toString();
    }

    public static void main(String[] args) {
        int input1 = 42;
        int input2 = 15;
        
        System.out.println("Input: " + input1);
        System.out.println("Output: " + decimalToBinary(input1));
        
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + decimalToBinary(input2));
    }
}
