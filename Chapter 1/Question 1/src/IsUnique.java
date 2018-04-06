import java.util.HashMap;
import java.util.Map;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * @author agedi
 */
public class IsUnique {
    /**
     *
     * @param string the string to check uniqueness
     * @return if the string has unique characters or not
     */
    public static boolean checkUnique(String string) {
        String loweredString = string.toLowerCase();
        Map map = new HashMap();
        char[] chars = loweredString.toCharArray();
        for (int index = 0; index < loweredString.length(); index++) {
            int asciiVal = (int) chars[index];
            if (map.containsKey(asciiVal)) {
                return false;
            }
            map.put(asciiVal, chars[index]);
        }
        return true;
    }
}