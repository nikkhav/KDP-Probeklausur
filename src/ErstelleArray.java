import java.util.Arrays;

public class ErstelleArray {

    public static void main(String[] args) {
        char[][] arr = erstelleArray(5);
        System.out.println(Arrays.deepToString(arr));
    }

    public static char[][] erstelleArray(int length) {
        char[][] res = new char[length][];

        for (int i = 0; i < length; i++) {
            res[i] = new char[length - i];
            for (int j = 0; j < res[i].length; j++) {
                char charToUse = i % 2 == 0 ? '*' : '#';
                res[i][j] = charToUse;
            }
        }

        return res;
    }
}
