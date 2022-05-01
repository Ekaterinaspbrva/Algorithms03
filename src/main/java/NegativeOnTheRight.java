public class NegativeOnTheRight {
    public int[] negativeOnTheRight(int[] a) {
        int  posCount = 0, negCount = 0;
        int[] posTemp = new int[a.length], negTemp = new int[a.length];
        for (int counter = 0; counter < a.length;counter++) {
            if (a[counter] > 0) {
                posTemp[posCount] = a[counter];
                posCount++;
            } else if (a[counter] < 0) {
                negTemp[negCount] = a[counter];
                negCount++;
            } else if (a[counter] == 0) {
                continue;
            }
        }
        int[] result = new int[posCount + negCount];
        int resultCount = 0;
        for (int counter = 0; counter < posCount; counter++) {
            result[resultCount++] = posTemp[counter];
        }
        for (int counter = 0; counter < negCount; counter++) {
            result[resultCount++] = negTemp[counter];
        }
        return result;
    }
}
