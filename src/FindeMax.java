public class FindeMax {
    public static void main(String[] args) {
        int[] zahlen = {5, 13, 33, 42, 25, 16};
        System.out.println(findeMaxIterativ(zahlen));
        System.out.println(findeMaxRekursiv(zahlen));
    }

    public static int findeMaxIterativ (int[] zahlen) {
        if (zahlen.length == 0) return 0;
        int max = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if(zahlen[i] > max) max = zahlen[i];
        }

        return max;
    }

    public static int findeMaxRekursiv (int[] zahlen) {
        if(zahlen.length == 0) return 0;
        int max = zahlen[0];

        return findeMaxRekursiv(zahlen, max, zahlen.length - 1);
    }

    public static int findeMaxRekursiv (int[] zahlen, int max, int index) {
        if(index == 0) return max;

        if(zahlen[index] > max) {
            return findeMaxRekursiv(zahlen, zahlen[index], index-1);
        } else {
            return findeMaxRekursiv(zahlen, max, index-1);
        }
    }
}
