public class Stack<T> {

    private Element top;
    private int maxNum;
    private int currentNum;

    public class Element {
        private T value;
        private Element next;

        public Element (T value) {
            this.value = value;
        }

        public String toString () {
            return value.toString();
        }
    }

    public Stack (int maxNum) {
        this.maxNum = maxNum;
    }

    public boolean isEmpty () {
        return currentNum == 0;
    }

    public boolean isFull () {
        return currentNum == maxNum;
    }

    public void push (T wert) throws StackIsFullException {
        if(isFull()) {
            throw new StackIsFullException(maxNum);
        }

        if(isEmpty()) {
            top = new Element(wert);
            currentNum = 1;
            return;
        }


        Element aktuell = top;
        top = new Element(wert);
        top.next = aktuell;
        currentNum++;

    }

    public String pop () {
        if(isEmpty()) return null;

        Element aktuell = top;
        top = aktuell.next;
        currentNum--;

        return aktuell.toString();
    }

    public String peek () {
        if(isEmpty()) return null;

        return top.toString();
    }

}
