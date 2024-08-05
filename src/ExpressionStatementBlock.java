import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        { // Block
            int value = 10; // Expression
            System.out.println("Hello World"); // Statement
        }
        // Assigment expression
        double valueDouble = 100;

        // ++, --
        valueDouble++;

        // Method invocation
        System.out.println("Hello");

        // Object creation expresion
        Date date = new Date();
    }
}

/**
* Expression
* Statement: */