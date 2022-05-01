import org.junit.jupiter.api.*;
public class NegativeOnTheRightTest {
    NegativeOnTheRight negsToEnd;
    @BeforeEach
    void setUp() {
        negsToEnd = new NegativeOnTheRight();
    }

@Test
    public void testNegativeOnTheRightHappyPath() {
    int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};
int[] actualResult = negsToEnd.negativeOnTheRight(array);
    Assertions.assertArrayEquals(expectedResult,actualResult);

}

}
