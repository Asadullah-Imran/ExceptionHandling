package Java_Try_Catch_Block;

public class Example3 {
    // we again do the same code again and in here we will call our exception different way
    // as our Exception for (50/0) is ArithmeticException so its Hierarchy
    // Throwable -> Exception -> RuntimeException -> ArithmeticException
    public static void main(String[] args) {
        try{
            int data1= 10/0;
        }catch (Throwable e){
            System.out.println("Throwable: " +e.getMessage());
            //e show the exception and message
            //e.getmessage() only provide the message
        }
        try{
            int data2= 10/0;
        }catch (Exception e){
            System.out.println("Exception: " +e.getMessage());
        }
        try{
            int data3= 10/0;
        }catch (RuntimeException e){
            System.out.println("RuntimeException: " +e.getMessage());
        }
        try{
            int data4= 10/0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " +e.getMessage());
        }
        System.out.println("The last line");

    }
}

//Conclusion
//Here we can understand we can call exception by its parent class
//it will work the same thing

//OUTPUT
//Throwable: / by zero
//Exception: / by zero
//RuntimeException: / by zero
//ArithmeticException: / by zero
//The last line
