package Java_Try_Catch_Block;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("First Line");
        try {
            int data= 50/0;
            System.out.println("I am in Try block");
        }catch (ArithmeticException e){
            System.out.println("I am in Catch Block ");
            System.out.println(e);
        }
        System.out.println("The last line");
    }
}

//Conclusion
// By adding try catch block now i was able to handle the error and
// print "The last line" .

///Output : (skiped "I am in Try block")
//First Line
//I am in Catch Block
//java.lang.ArithmeticException: / by zero
//The last line