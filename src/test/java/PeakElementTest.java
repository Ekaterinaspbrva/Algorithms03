import org.junit.jupiter.api.*;

public class PeakElementTest {
    PeakElement peakEl;
    @BeforeEach
    void setUp() {
        peakEl = new PeakElement();
    }
    @Test
    public void testPeakElementHappyPath() {
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
//        int[] array = {0, 2, -7, 5, 0, 0, 23, 1};
        int[] expectedResult = {3, 7, 23};
        int[] actualResult = peakEl.peakElement(array);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


}
