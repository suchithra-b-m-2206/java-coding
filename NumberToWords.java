public class NumberToWords {

    // Arrays to hold words for digits and places
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
        "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convert(int number) {
        if (number == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();

        if (number / 1000 > 0) {
            result.append(convert(number / 1000)).append(" Thousand ");
            number %= 1000;
        }

        if (number / 100 > 0) {
            result.append(convert(number / 100)).append(" Hundred ");
            number %= 100;
        }

        if (number > 0) {
            if (result.length() != 0) {
                result.append("and ");
            }

            if (number < 20) {
                result.append(units[number]);
            } else {
                result.append(tens[number / 10]);
                if (number % 10 > 0) {
                    result.append(" ").append(units[number % 10]);
                }
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        int number1 = 438;
        int number2 = 12345;
        
        System.out.println("Input: " + number1);
        System.out.println("Output: " + convert(number1) + ".");
        
        System.out.println("\nInput: " + number2);
        System.out.println("Output: " + convert(number2) + ".");
    }
}
