/* Problem Statement:
        Given a string, the task is to check whether a string contains only alphabets or not using Regex in Java.
   Examples:
        Input : Welcome
        Output : True

        Input : Welcome123
        Output : False

        Input : null
        Output : False

Algorithm followed:
        String.matches() method is used to check whether or not the string matches the given regex.
        1> Get the string
        2> Match the string with the Regex using matches().
        3> Return true is matched

Pseudocode:

public static boolean isStringOnlyAlphabet(String str)
{
return ((!str.equals(""))
&& (str != null)
&& (str.matches("^[a-zA-Z]*$")));
}

Below is the full implementation of the above mentioned algorithm.              */

class ContainingAlphabetsOnly {

    // Function to check String for only Alphabets
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    // Main method
    public static void main(String[] args)
    {

        // Checking for True case
        System.out.println("Test Case 1:");

        String str1 = "Welcome";
        System.out.println("Input: " + str1);
        System.out.println(
            "Output: "
            + isStringOnlyAlphabet(str1));

        // Checking for String with numeric characters
        System.out.println("\nTest Case 2:");

        String str2 = "Welcome123";
        System.out.println("Input: " + str2);
        System.out.println(
            "Output: "
            + isStringOnlyAlphabet(str2));

        // Checking for null String
        System.out.println("\nTest Case 3:");

        String str3 = null;
        System.out.println("Input: " + str3);
        System.out.println(
            "Output: "
            + isStringOnlyAlphabet(str3));

        // Checking for empty String
        System.out.println("\nTest Case 4:");

        String str4 = "";
        System.out.println("Input: " + str4);
        System.out.println(
            "Output: "
            + isStringOnlyAlphabet(str4));
    }
}
