/**
 * Write a method to replace all spaces in a string with '%20'. You may
 * assume that the string has sufficient space at the end to hold the
 * additional characters, and that you are given the "true" length of the string
 * Example Input: "Mr John Smith", 13
 *         Output: "Mr%20John%20Smith"
 */
public class Urlify {
    /**
     *
     * @param string the string that will be modified
     * @param trueLength the actual length of the string (space included)
     * @return the modified string
     */
    public static String urlify(String string, int trueLength) {
        String result = "";
        char[] chars = string.toCharArray();
        for (int index = 0; index < trueLength; index++) {
            if ((int) chars[index] == 32) {
                result = result + "%20";
            } else {
                result = result + chars[index];
            }
        }
        return result;
    }

}
