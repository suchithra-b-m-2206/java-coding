import java.util.Stack;

public class RemoveUnbalancedParentheses {

    public static String removeUnbalancedParentheses(String input) {
        // Stack to store the indexes of open parentheses
        Stack<Integer> stack = new Stack<>();
        // Array to mark valid parentheses
        boolean[] valid = new boolean[input.length()];

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                // Push index of '(' to stack
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    // Mark matching '(' and ')' as valid
                    valid[stack.pop()] = true;
                    valid[i] = true;
                }
            } else {
                // Non-parentheses characters are always valid
                valid[i] = true;
            }
        }

        // Build the result string with valid parentheses and characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (valid[i]) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "((abc)((de))";
        String input2 = "(a(b)))(c(d)";
        String input3 = "(((ab)";
        
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removeUnbalancedParentheses(input1));
        
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + removeUnbalancedParentheses(input2));
        
        System.out.println("\nInput: " + input3);
        System.out.println("Output: " + removeUnbalancedParentheses(input3));
    }
}
