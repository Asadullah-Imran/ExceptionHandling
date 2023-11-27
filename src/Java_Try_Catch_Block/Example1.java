package Java_Try_Catch_Block;

public class Example1 {
    public static void main(String[] args) {
        int data=50/0;
        System.out.println("last Line");
    }
}

//Conclusion:
// as nothing can be divided by zero so it will gave a exception
// this is a ArithmeticException;
// Hierarchy of Exception below
// Throwable -> Exception -> RuntimeException -> ArithmeticException


// Example 2 will show you how to handle the exception.