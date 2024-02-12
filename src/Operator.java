public class Operator extends Ausdruck {
    public enum OperatorTyp {
        Addition,
        Multiplikation
    }

    Operand op1;
    Operand op2;
    OperatorTyp operator;

    public Operator(Operand op1, Operand op2, OperatorTyp operator) {
        this.op1 = op1;
        this.op2 = op2;
        this.operator = operator;
    }


    public double auswerten() {
        switch (operator) {
            case Addition:
                return this.op1.auswerten() + op2.auswerten();
            case Multiplikation:
                return this.op1.auswerten() * op2.auswerten();
            default:
                return 0;
        }

    }
}
