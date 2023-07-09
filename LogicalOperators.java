public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean resultAnd = a && b;
        System.out.println("Logical AND: " + resultAnd);

        // Logical OR
        boolean resultOr = a || b;
        System.out.println("Logical OR: " + resultOr);

        // Logical NOT
        boolean resultNotA = !a;
        boolean resultNotB = !b;
        System.out.println("Logical NOT a: " + resultNotA);
        System.out.println("Logical NOT b: " + resultNotB);
    }
}
