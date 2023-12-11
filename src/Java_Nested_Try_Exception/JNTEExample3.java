package Java_Nested_Try_Exception;

public class JNTEExample3 {
    public static void main(String[] args) {
        //Outer Try block start
        try {

            //Inner 1 try block
            try{
                System.out.println("First Inner block");
                int[]arr=new int[5];
                int x=arr[10];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("this is catch section of inner 1 catch block ");
            }
            finally {
                System.out.println("finally of first inner block");
            }

            // second inner class start
            try{
                System.out.println("This is the second inner block");
                int a=6/0;
            }catch (ArithmeticException e){
                System.out.println("This is catch section for inner 2 catch block");
            }
            finally {
                System.out.println("finally for second inner block");
            }

            String str=null;
            int len=str.length();
            //outer Try block ends here
        }catch (Exception e){ //outer catch block start
            System.out.println("Handler for Outer try block");
        }//outer catch block ends here
        finally {
            System.out.println("outer finally executed");
        }
    }
}
