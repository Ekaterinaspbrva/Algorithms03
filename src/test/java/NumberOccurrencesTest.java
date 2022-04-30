import org.junit.jupiter.api.*;
public class NumberOccurrencesTest {
    NumberOccurrences numOcc; // foe BeforeEach below
    @BeforeEach
    void setUp() {
        NumberOccurrences numOcc = new NumberOccurrences(); //instead of creating instance of class inside the method
    }

    @Test
    public void testNumberOccurrencesHappyPath() {
int[] array = new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
int[][] expectedResult = new int[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};
int[][] actualResult = numOcc.numberOccurrences(array);

Assertions.assertArrayEquals(expectedResult,actualResult);
    }

//    @Test
//    public void testNumberOccurrencesSameValues() {
//        int[] array = new int[]{1,1,1,1,1,1,1};
//        int[][] expectedResult = new int[][]{{1, 7}};
//        int[][] actualResult = numOcc.numberOccurrences(array);
//
//        Assertions.assertArrayEquals(expectedResult,actualResult);
//    }


















}
