

public class StringRotationChecker {

    public static void main(String[] args) {
        // Test cases
        String str1 = "hello";
        String str2 = "lohel";

        boolean result = areRotations(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + result);

        str1 = "hello";
        str2 = "world";

        result = areRotations(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + result);
    }

    // Method to check if two strings are rotations of each other
    public static boolean areRotations(String str1, String str2) {
        // Check if both strings are of the same length and are not empty
        if (str1.length() == str2.length() && !str1.isEmpty()) {
            // Concatenate str1 with itself and see if str2 is a substring of the result
            String concatenated = str1 + str1;
            return concatenated.contains(str2);
        }
        return false;
    }
}
