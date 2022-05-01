import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NumberOccurrencesTest {
    NumberOccurrences numOcc; // for BeforeEach below
    @BeforeEach
    void setUp() {
        numOcc = new NumberOccurrences(); //instead of creating instance of class inside the method
    }

    @Test
    public void testNumberOccurrencesHappyPath() {
int[] array = new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
int[][] expectedResult = new int[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};
int[][] actualResult = numOcc.numberOccurrences(array);

Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNumberOccurrencesSameValues() {
        int[] array = new int[]{1,1,1,1,1,1,1};
        int[][] expectedResult = new int[][]{{1, 7}};
        int[][] actualResult = numOcc.numberOccurrences(array);

    Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNumberOccurrencesNoValues() {
        int[] array = new int[]{};
        int[][] expectedResult = new int[][]{};
        int[][] actualResult = numOcc.numberOccurrences(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNumberOccurrencesNegPosValues() {
        int[] array = new int[]{-1,1,-5,4,10,-7,1,-1,1,-5,4,7,1,-1,1,-5,4};
        int[][] expectedResult = new int[][]{{-7, 1}, {-5, 3}, {-1, 3}, {1, 5}, {4, 3}, {7, 1}, {10, 1}};
        int[][] actualResult = numOcc.numberOccurrences(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNumberOccurrencesNegValues() {
        int[] array = new int[]{-1,-1,-5,-4,-10,-7,-1,-1,-1,-5,-4,-7,-1,-1,-1,-5,-4};
        int[][] expectedResult = new int[][]{{-10, 1}, {-7, 2}, {-5, 3}, {-4, 3}, {-1, 8}};
        int[][] actualResult = numOcc.numberOccurrences(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNumberOccurrencesInclZeroes() {
        int[] array = new int[]{-1,0,-1,0,-1,0,1,0,1,-1,0};
        int[][] expectedResult = new int[][]{{-1, 4}, {0, 5}, {1, 2}};
        int[][] actualResult = numOcc.numberOccurrences(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testNumberOccurrencesOnlyZeroes() {
        int[] array = new int[]{0,0,0,0,0,0,0,0,0};
        int[][] expectedResult = new int[][]{{0, 9}};
        int[][] actualResult = numOcc.numberOccurrences(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }














}
