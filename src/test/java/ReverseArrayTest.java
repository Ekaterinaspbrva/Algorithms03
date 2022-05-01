import org.junit.jupiter.api.*;

public class ReverseArrayTest {
    ReverseArray revArr;
    @BeforeEach
    void setUp() {
        revArr = new ReverseArray();
    }

    @Test
    public void testReverseArrayHappyPath() {
            int[] array = {2, 7, 3, 10};
            int[] expectedResult = {10, 3, 7, 2};
            int[] actualResult = revArr.reverseArray(array);
            Assertions.assertArrayEquals(expectedResult,actualResult);

    }
}
