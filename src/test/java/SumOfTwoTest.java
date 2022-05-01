import org.junit.jupiter.api.*;

import java.util.Arrays;

public class SumOfTwoTest {
SumOfTwo sumTwo;
@BeforeEach
    void setUp() {
    sumTwo = new SumOfTwo();
}

@Test
    public void testSumOfTwoHappyPath() {
    int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
    int n = 12;

    int[][] expectedResult = {{3, 9}, {7, 5}};
    int[][] actualResult = sumTwo.sumOfTwo(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12},12);
    Assertions.assertArrayEquals(expectedResult,actualResult);

}




}
