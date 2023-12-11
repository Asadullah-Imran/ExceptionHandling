package Java_Catch_Multiple_Exception;

public class JCMEExample1 {
    public static void main(String[] args) {
        try{
            int[] arr=new int[5];
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e){
            System.out.println("This is a Arithmetic exception");
            System.out.println("Write here instruction for Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is a ArrayIndexOutOfBoundsException");
            System.out.println("Write here instruction for ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("this is a generic exception ");
            System.out.println("Write here instruction for Generic Exception");
        }

        finally {
            System.out.println("Exception try catch block performed");
        }
    }
}

