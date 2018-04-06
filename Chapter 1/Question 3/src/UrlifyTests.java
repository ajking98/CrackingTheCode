import org.junit.Assert;
import org.junit.Test;
public class UrlifyTests {

    @Test
    public void testBasic() {
        String result = Urlify.urlify("Mr John Smith", 13);
        Assert.assertEquals(17, result.length());
        Assert.assertEquals("Mr%20John%20Smith", result);
    }

    @Test
    public void testJustSpaces() {
        String result = Urlify.urlify("          ", 10);
        Assert.assertEquals(30, result.length());
        Assert.assertEquals("%20%20%20%20%20%20%20%20%20%20", result);
    }
}
