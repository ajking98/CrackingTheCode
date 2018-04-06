import org.junit.Assert;
import org.junit.Test;
public class PermutationTests {

    @Test
    public void testBasic() {
        boolean result = CheckPermutation.checkForPermutation("h e l lo",
                "he   llo");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testUppercase() {
        boolean result = CheckPermutation.checkForPermutation("Tact Coa",
                "Taco Cat" );
        Assert.assertEquals(true, result);
    }

    @Test
    public void testLowercae() {
        boolean result = CheckPermutation.checkForPermutation("racecar",
                "cecraar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testSpaces() {
        boolean result = CheckPermutation.checkForPermutation("   ", "   ");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testSpecialCharacters() {
        boolean result = CheckPermutation.checkForPermutation("!@#$%^&*()" +
                "{}:|?>", ":|?!@#$%^&*()>{}");
        Assert.assertEquals(true, result);
    }
}
