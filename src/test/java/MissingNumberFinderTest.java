import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberFinderTest {

    @Test
    public void testFindMissingNumber() {

        int[] array = {5, 0, 1, 3, 2};
        assertEquals(4, MissingNumberFinder.findMissingNumber(array));

        int[] array2 = {7, 9, 10, 11, 12};
        assertEquals(8, MissingNumberFinder.findMissingNumber(array2));

        int[] emptyArray = {};
        assertEquals(0, MissingNumberFinder.findMissingNumber(emptyArray));

        int[] singleElementArray = {0};
        assertEquals(1, MissingNumberFinder.findMissingNumber(singleElementArray));

        int[] completeArray = {0, 1, 2, 3, 4, 5};
        assertEquals(6, MissingNumberFinder.findMissingNumber(completeArray));

    }
}
