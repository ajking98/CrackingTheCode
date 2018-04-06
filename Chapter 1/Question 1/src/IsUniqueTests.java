import org.junit.Assert;
import org.junit.Test;
public class IsUniqueTests {

    @Test
    public void testBasic() {
        boolean result = IsUnique.checkUnique("QWERTY");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testForFailure() {
        boolean result = IsUnique.checkUnique("QWERTY QWERTY");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testForLowercase() {
        boolean result = IsUnique.checkUnique("asdfghjklzxcvbnmqwertyop");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testForUppercase() {
        boolean result = IsUnique.checkUnique("QWERTYUIOPASDFGHJKLZXCVB");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testForNumbersFailing() {
        boolean result = IsUnique.checkUnique("41284284154578415");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testForNumbersPassing() {
        boolean result = IsUnique.checkUnique("0123456789");
        Assert.assertEquals(true, result);
    }
}
