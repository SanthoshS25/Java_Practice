package Chapter_2_DataTypes;

public class OperatorsPractice {
    public static void main(String[] args) {
        
        byte a = 15; // As of now, we using less value, so, I used Byte which consumes less memory
        byte b = 4;

        System.out.println("Sum : "+ (a + b)); // Addition od a and b
        System.out.println("Subtraction ; " + (a - b)); // subtraction of a and b
        System.out.println("Multiplication : " + (a * b)); // Multiply of a and b
        System.out.println("Integer Division : " + (a / b)); // integer division of a and b
        System.out.println("Modulus : " + (a % b)); // modulus of a and b
        System.out.println("Checks A Greater Than B : " + (a > b)); // a greater than b
        System.out.println("Checks A is Odd Or even : " + (a % 2 == 0)); // a % 2 == 0 checks

    }
}
