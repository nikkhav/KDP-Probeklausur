public class TestAusdruck {
    public static void main (String[] args) {
        Operand op1 = new Operand(10);
        Operand op2 = new Operand(4);

        Operator operator1 = new Operator(op1, op2, Operator.OperatorTyp.Multiplikation);
        Operand op3 = new Operand(operator1.auswerten());
        Operand op4 = new Operand(2);

        Operator operator2 = new Operator(op3,op4, Operator.OperatorTyp.Addition);

        System.out.println("Wert = " + operator2.auswerten());


    }
}
