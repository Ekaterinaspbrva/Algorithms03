public class PeakElement {

    public  int[] peakElement(int[] a) {
        int[] temp = new int[a.length];
        int newArrCounter  = 0, counter;
        for (counter = 0; counter < a.length; counter++) {
            if (counter == 0) {
                if (a[counter] > a[counter + 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            } else if (counter == a.length - 1) {
                if (a[counter] > a[counter - 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            } else {
                if (a[counter] > a[counter + 1] && a[counter] > a[counter - 1]) {
                    temp[newArrCounter] = a[counter];
                    newArrCounter++;
                }
            }
        }
        int[] result = new int[newArrCounter];
        for (counter = 0; counter < newArrCounter; counter++) {
            result[counter] = temp[counter];
        }
        return result;
    }
}
