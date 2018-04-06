import java.util.Arrays;
/**
 * Given two strings, write a method to decide if one is a permutation of the
 * other
 */
public class CheckPermutation {
    /**
     *
     * @param firstString the first string
     * @param secondString the second string
     * @return return if the strings are permuations of each other or not
     */
    public static boolean checkForPermutation(String firstString, String
            secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        char[] charsFirst = firstString.toCharArray();
        Arrays.sort(charsFirst);
        char[] charsSecond = secondString.toCharArray();
        Arrays.sort(charsSecond);
        return Arrays.equals(charsFirst, charsSecond);
    }
}
