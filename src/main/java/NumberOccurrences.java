public class NumberOccurrences {

    public int[][] numberOccurrences (int[] a) {
        for (int i : a) {
if ((int) i != i) {
    return null;
}
        }
        int nonUni = 0, stopper;
        for (int counterVar1 = 0; counterVar1 < a.length; counterVar1++) { //counting new arr size
            for (int counterIter = counterVar1 + 1; counterIter < a.length; counterIter++) {
                if (a[counterVar1] == a[counterIter]) {
                    nonUni++;
                    break;
                }
            }
        }
        int[] uniArr = new int[a.length - nonUni]; // var 1
        int[] nonUniArr = new int[nonUni];
        int counterNewArr = 0;
        nonUni = 0;
        for (int counterVar1 = 0; counterVar1 < a.length; counterVar1++) { //building new arr
            stopper = 0;
            for (int counterIter = counterVar1 + 1; counterIter < a.length; counterIter++) {
                if (stopper == 0) {
                    if (a[counterVar1] == a[counterIter]) {
                        nonUniArr[nonUni++] = a[counterVar1];
                        stopper++;
                    }
                }
            }
            if (stopper == 0) {
                uniArr[counterNewArr++] = a[counterVar1];
            }
        }
        for (int bypass = 0; bypass < uniArr.length - 1; bypass++) {
            boolean already_sorted = true;
            for (int i = 0; i < uniArr.length - 1 - bypass; i++) {
                if (uniArr[i] > uniArr[i + 1]) {
                    int temp = uniArr[i];
                    uniArr[i] = uniArr[i + 1];
                    uniArr[i + 1] = temp;
                    already_sorted = false;
                }
            }
            if (already_sorted) {
                break;
            }
        }
        int[][] result = new int[uniArr.length][2];
        int uniNum, uniCount;
        for (int uniArrCounter = 0; uniArrCounter < uniArr.length; uniArrCounter++) {
            uniCount = 0;
            for(int origArrCounter = 0; origArrCounter < a.length; origArrCounter++) {
                if (uniArr[uniArrCounter] == a[origArrCounter]) {
                    uniCount++;
                }
            }
            result[uniArrCounter][0] = uniArr[uniArrCounter];
            result[uniArrCounter][1] = uniCount;
        }
        return result;
    }
}
