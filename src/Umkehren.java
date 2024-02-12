public class Umkehren<T> {
    public static void main(String[] args) {
        String[] stringArr = {"Ich", "bin", "ein", "Berliner"};
        String[] res = umkehren(stringArr);

        for (String wort : res) {
            System.out.print(wort + " ");
        }
    }


    public static<T> T[] umkehren(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int swapIndex = array.length - 1 - i;
            T temp = array[i];
            array[i] = array[swapIndex];
            array[swapIndex] = temp;
        }
        return array;
    }

}
