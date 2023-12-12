package Java_Throw_Exception;

//Throwing Unchecked Exception
public class JTEExample1 {
    public static void validate(int age) {
        if(age<14) {
            //throw Arithmetic exception if not eligible to watch
            throw new ArithmeticException("Kids are not allowed to watch this video");
        }
        else {
            System.out.println("Happy Watching...!");
        }
    }
    public static void main(String[] args) {
        try {
            validate(12);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
            System.out.println("rest of the code..");
    }
}

