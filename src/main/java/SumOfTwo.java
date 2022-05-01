import java.util.Arrays;

public class SumOfTwo {
    public int[][] sumOfTwo(int[] a, int n) {
        int uniCounter = 0, stopper;// remove dupes
        int[] temp = new int[a.length];
        for (int counterVar1 = 0; counterVar1 < a.length; counterVar1++) { //counting new arr size
            stopper = 0;
            for (int counterIter = counterVar1 + 1; counterIter < a.length; counterIter++) {
                if (stopper == 0) {
                    if (a[counterVar1] == a[counterIter]) {
                        stopper++;
                    }
                }
            }
            if (stopper == 0) {
                temp[uniCounter++] = a[counterVar1];
            }
        }
        int[] uniArr = new int[uniCounter];
        for (int counter = 0; counter < uniCounter; counter++) {
            uniArr[counter] = temp[counter];
        }

        int summedCounter = 0;
        int[][] temp2 = new int[uniArr.length][2];
        for (int i = 0; i < uniArr.length; i++) { //counting new arr size and creating a temp arr
            stopper = 0;
            for (int j = i + 1; j < uniArr.length; j++) {
                if (stopper == 0) {
                    if (uniArr[i] + uniArr[j] == n) {
                        temp2[summedCounter][0] = uniArr[i];
                        temp2[summedCounter][1] = uniArr[j];
                        summedCounter++;
                        stopper++;
                    }
                }
            }
        }
        int[][] summed = new int[summedCounter][2];
        for (int counter = 0; counter < summedCounter; counter++) { // removing dupes and creating temp
            summed[counter] = temp2[counter];
        }
        int resArrCounter = 0;
        temp2 = new int[summed.length][];
        for (int counterVar1 = 0; counterVar1 < summed.length; counterVar1++) {
            stopper = 0;
            for (int counterIter = counterVar1 + 1; counterIter < summed.length; counterIter++) {
                if (stopper == 0) {
                    if (Arrays.equals(summed[counterVar1], summed[counterIter])) {
                        stopper++;
                    }
                }
            }
            if (stopper == 0) {
                temp2[resArrCounter++] = summed[counterVar1];
            }
        }

        return summed;
    }
}
