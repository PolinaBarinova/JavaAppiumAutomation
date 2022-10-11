import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a = this.getLocalNumber();
        Assert.assertTrue("getLocalNumber не возвращает 14",a==14);
    }
    @Test
    public void testGetClassNumber()
    {
        int b = this.getClassNumber();
        Assert.assertTrue("getClassNumber возвращает число меньше или равно 45",b > 45);
    }

    @Test
    public void testGetClassString()
    {
        String string = getClassString();
        String substring = "hello";
        Assert.assertTrue("Строка не содержит hello", string.toUpperCase().contains(substring.toUpperCase()));
    }
}
