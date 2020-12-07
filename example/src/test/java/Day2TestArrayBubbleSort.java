import array.Day2ArrayAndBubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day2TestArrayBubbleSort {

     private Day2ArrayAndBubbleSort arrTest;


    @Before
    public void addArray() {
        arrTest = new Day2ArrayAndBubbleSort(100);

        for (int j = 0; j < 100; j++) {
            arrTest.insert(100 - j);
        }

    }

    @Test
    public void whenAdd100ElSizeEqual100() {
        long expR = 98;
        Assert.assertEquals(expR, arrTest.getElem(2));
    }

    @Test
    public void whenAddElemIndex2Eq98ThenElemEqual98() {
        int expR = 100;
        Assert.assertEquals(expR, arrTest.size());
    }

    @Test
    public void whenArraySortElementInvert() {
        arrTest.display();

        arrTest.sortBubble();
        arrTest.display();
        long expRFirst = 1;
        long expRLast = 100;
        long expRThirth = 3;
        Assert.assertEquals(expRFirst, arrTest.getElem(0));
        Assert.assertEquals(expRLast, arrTest.getElem(99));
        Assert.assertEquals(expRThirth, arrTest.getElem(2));
    }






}
