import array.HighArray;
import org.junit.Assert;
import org.junit.Test;

public class HighArrayTest {

    @Test
    public void whenInsertTwoElementsThenSizeArrayIsTwo() {
        HighArray arr = new HighArray(100);
        arr.insert(11);
        arr.insert(22);
        Assert.assertEquals(2, arr.size());
    }


    @Test
    public void whenInsertElementsTheneThisElementTrue() {
        HighArray arr = new HighArray(100);
        arr.insert(11);
        arr.insert(22);
        Assert.assertEquals(true, arr.find(22));
        Assert.assertEquals(true, arr.find(11));
    }


    @Test
    public void whenExistsElementThenReturnTrue() {
        HighArray arr = new HighArray(100);
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        arr.insert(00);
        Assert.assertTrue(arr.find(55));
    }
}
