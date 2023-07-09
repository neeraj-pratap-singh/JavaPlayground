public class BitwiseAndTernaryOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Bitwise AND
        int bitwiseAnd = num1 & num2;
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // Bitwise OR
        int bitwiseOr = num1 | num2;
        System.out.println("Bitwise OR: " + bitwiseOr);

        // Bitwise XOR
        int bitwiseXor = num1 ^ num2;
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // Bitwise NOT
        int bitwiseNotNum1 = ~num1;
        System.out.println("Bitwise NOT of num1: " + bitwiseNotNum1);

        // Left shift
        int leftShift = num1 << 1;
        System.out.println("Left shift of num1: " + leftShift);

        // Right shift
        int rightShift = num1 >> 1;
        System.out.println("Right shift of num1: " + rightShift);

        // Unsigned right shift
        int unsignedRightShift = num1 >>> 1;
        System.out.println("Unsigned right shift of num1: " + unsignedRightShift);

        // Ternary Operator
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum value: " + max);
    }
}
