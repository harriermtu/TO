import junit.framework.TestCase;

public class IntArrayOpsTest extends TestCase {

    public void testFindMedianSortedArraysEmptyArrays() throws Exception {
        //puste tablice
        assertEquals(0,IntArrayOps.findMedianSortedArrays(new int[]{},new int[]{}));
    }

    public void testFindMedianSortedArraysRandom() throws Exception {
        assertEquals(4.0, IntArrayOps.findMedianSortedArrays(new int[]{-1, 1, 2, 3, 4, 5}, new int[]{4, 5, 6, 72, 234234}));
        assertEquals(1.5, IntArrayOps.findMedianSortedArrays(new int[]{-1, 1}, new int[]{2, 3}));
    }

    public void testFindMedianSortedArraysOneElementZero() throws Exception {
        assertEquals(0.0,IntArrayOps.findMedianSortedArrays(new int[]{0},new int[]{0}));
    }

    public void testFindK1EmptyArray() throws Exception {
        //puste tablice
        assertEquals(0,IntArrayOps.findK1(new int[]{}, new int[]{}, 0));
    }

    public void testFindK1RandomArray() throws Exception {
        assertEquals(2, IntArrayOps.findK1(new int[]{1, 2, 3, 4, 5}, new int[]{}, 2));
        assertEquals(1,IntArrayOps.findK1(new int[]{3,6,1,4,5}, new int[]{}, 3));
        assertEquals(5,IntArrayOps.findK1(new int[]{1,2,3,4,5,1234}, new int[]{}, 5));
    }

    public void testFirstMissingPositiveWithBigN() throws Exception {

        //brak walidacji n
        assertEquals(4,IntArrayOps.firstMissingPositive(new int[]{1,2,3,5},4));

    }

    public void testIsPalindromePositive() throws Exception {
        assertEquals(true,IntArrayOps.isPalindrome(111));
        assertEquals(true,IntArrayOps.isPalindrome(121));
        assertEquals(true,IntArrayOps.isPalindrome(21212));
        assertEquals(false,IntArrayOps.isPalindrome(111331));
        assertEquals(false,IntArrayOps.isPalindrome(12));
    }
    public void testIsPalindromeManyZeros() throws Exception {
        assertEquals(true, IntArrayOps.isPalindrome(0001));
    }

    public void testIsPalindromeNegative() throws Exception {
        assertEquals(false, IntArrayOps.isPalindrome(-111));
    }

    public void testLISEmptyArray() throws Exception {
        //blad na pustej tablicy
        IntArrayOps.LIS(new int[]{});
    }
}