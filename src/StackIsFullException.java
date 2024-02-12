public class StackIsFullException extends Exception {
    StackIsFullException (int num) {
        super("Der Stapel kann maximal " + num + " Werte enthalten");
    }
}
