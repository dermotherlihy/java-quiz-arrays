import com.dermotherlihy.array.ArrayFinder;
import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;


public class ArrayFinderUTest {

    private ArrayFinder testObj = new ArrayFinder();

    @Test(expected = NoSuchElementException.class)
    public void testFindStartingPositionEmptyArrays(){
        String[] firstArray = {};
        String[] secondArray = {};
        testObj.findStartingPosition(firstArray,secondArray);
    }

    @Test(expected = NoSuchElementException.class)
    public void testFindStartingPositionEmptySecondArray(){
        String[] firstArray = {"1","2","3","4","5","7"};
        String[] secondArray = {};
        testObj.findStartingPosition(firstArray,secondArray);
    }

    @Test(expected = NoSuchElementException.class)
    public void testFindStartingPositionEmptyFirstArray(){
        String[] firstArray = {};
        String[] secondArray = {"1","2","3","4","5","7"};
        testObj.findStartingPosition(firstArray,secondArray);
    }

    @Test(expected = NoSuchElementException.class)
    public void testFindStartingPositionSecondArrayLargerThanFirstArray(){
        String[] firstArray = {"1","2"};
        String[] secondArray = {"1","2","3","4","5","7"};
        testObj.findStartingPosition(firstArray,secondArray);
    }

    @Test
    public void testFindStartingPositionSecondArrayRepeatedNumerousTimesInFirstArray(){
        String[] firstArray = {"1","2","1","2","1","2","1","2","1","2","1","3"};
        String[] secondArray = {"1","2"};
        int result = testObj.findStartingPosition(firstArray, secondArray);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void testFindStartingPositionSecondArrayAtStartOfFirstArray(){
        String[] firstArray = {"3","4","5","6","7","8","9"};
        String[] secondArray = {"3","4"};
        int result = testObj.findStartingPosition(firstArray, secondArray);
        Assert.assertTrue(result==0);
    }

    @Test
    public void testFindStartingPositionSecondArrayAtEndOfFirstArray(){
        String[] firstArray = {"3","4","5","6","7","8","9"};
        String[] secondArray = {"8","9"};
        int result = testObj.findStartingPosition(firstArray, secondArray);
        Assert.assertTrue(result==5);
    }

    @Test
    public void testFindStartingPositionSecondArrayInfFirstArray(){
        String[] firstArray = {"3","4","5","6","7","8","9"};
        String[] secondArray = {"4","5"};
        int result = testObj.findStartingPosition(firstArray, secondArray);
        Assert.assertTrue(result==1);
    }

    @Test
    public void testFindStartingPositionEqualArrays(){
        String[] firstArray = {"3","4","5","6","7","8","9"};
        int result = testObj.findStartingPosition(firstArray, firstArray);
        Assert.assertTrue(result==0);
    }

}
