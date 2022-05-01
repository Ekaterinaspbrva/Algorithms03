public class ReverseArray {

public int[] reverseArray(int[] a) {
    int[] temp = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        temp[temp.length - i - 1] = a[i];
    }
    return temp;
}
}
