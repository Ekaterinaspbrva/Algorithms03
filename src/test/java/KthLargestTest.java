import org.junit.jupiter.api.*;

public class KthLargestTest {
    KthLargest kth;
    @BeforeEach
    void setUp() {
        kth = new KthLargest();
    }

    @Test
public void testKthLargest() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
    int expectedResult = 9;
    int actualResult = kth.kthLargest(array, k);

    Assertions.assertEquals(expectedResult,actualResult);
}
}
