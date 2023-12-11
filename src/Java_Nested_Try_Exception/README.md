## Java Nested Try Exception
Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.

For example, the **inner try block** can be used to handle `ArrayIndexOutOfBoundsException` while the **outer try block** can handle the `ArithemeticException` (division by zero).

## Example 1
Here is `one try-catch-finally` block (Outer block) as usual . but in this try block there is another `two try-catch-finally` block (Inner-Block).
In those two inner block, first inner block has ArithmeticException and the second inner block has ArrayIndexOutOfBoundsException . 

```java
public class JNTEExample1 {
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

            //outer Try block ends here
        }catch (Exception e){ //outer catch block start
            System.out.println("Handler for Outer try block");
        }//outer catch block ends here
        finally {
            System.out.println("outer finally executed");
        }
    }
}
```
Output:
```output
First Inner block
this is catch section of inner 1 catch block 
finally of first inner block
This is the second inner block
This is catch section for inner 2 catch block
finally for second inner block
outer finally executed
```
**Conclusion** <br>
So when it is executed, the compiler first read the outer try block then as there is two more try-catch-finally block , so then it reads the first inner block's try block and if there is any exception then the catch and then the finally block of First inner block then it goes same for the second inner block . now compiler read all the inner block 
after that it goes to the Catch block if there is any exception after that it execute finally block of Outer block.

## Example 2
adding exception code in Outer try block.
```java

public class JNTEExample2 {
    public static void main(String[] args) {
        //Outer Try block start
        try {
            String str=null;
            int len=str.length();
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


            //outer Try block ends here
        }catch (Exception e){ //outer catch block start
            System.out.println("Handler for Outer try block");
        }//outer catch block ends here
        finally {
            System.out.println("outer finally executed");
        }
    }
}

```
Output:
```output
Handler for Outer try block
outer finally executed
```
**Conclusion** <br>
If you add Exception code at before the inner try catch block then it will not execute as we know when Compiler goes to the try block and found one exception it directly go to the catch block with out reading other code of try block .

## Example 3
adding exception code in Outer try block (another way).
```java
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

```
Output:
```output
First Inner block
this is catch section of inner 1 catch block 
finally of first inner block
This is the second inner block
This is catch section for inner 2 catch block
finally for second inner block
Handler for Outer try block
outer finally executed
```
**Conclusion** <br>
if we need to handle the first outer try block then we need to add the exception code after the inner block.