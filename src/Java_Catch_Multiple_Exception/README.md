# Java Catch Multiple Exception

We can handle multiple exception in 1 **try block** 
Suppose we found a case where there could be `ArithmeticException` or `ArrayIndexOutOfBoundsException` but we do not know which exception should be called in that case we can handle the exception by calling multiple catch block.

but now the Question stands why we need to called multiple catch block where we can call the parent Exception class and handle all the exception like `(Exception e)`

The answer is we should handle the Exception so specifically so that we can send a specific response for specific exception. below you can see a example:

### Example 1:
```java
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
```
Output is: 
```output
This is a ArrayIndexOutOfBoundsException
Write here instruction for ArrayIndexOutOfBoundsException
Exception try catch block performed
```
**conclusion** <br>
_So here we can handle the specific exception and call the specific print line or method._

## FlowChart of Multi Catch Block
![flowchart](../../assets/multipleCatchBlockInJava.png)


### Some more Exception Example
## Example 2
In try catch block there will be only one exception you can handle. you can not handle multiple exception in **1 try catch block**

```java
public class JCMEExample2 {
    public static void main(String[] args) {
        try{
            int a=5/0;
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
```
Output:
```output
This is a Arithmetic exception
Write here instruction for Arithmetic exception
Exception try catch block performed
```
**Conclusion**</br>
in this example 2 there is two exception in try block but when the program run it called the try block when it got exception it directly go through the catch block. it does not check the other part of try block. that is why when compiler found first exception (ArithmeticException) in the try block it did check our other ArrayIndexOutOfBoundsException.
`So we will always write one exception in each try block`

## Example 3
In multiple catch block it is very important to maintain the order of Exception class.
such as we can not call the parent class exception first. Rather than we will call the child class exception first then the parent class example
```java
public class JCMEExpample3 {
    public static void main(String[] args) {
        try{
            int[] arr=new int[5];
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("this is a generic exception ");
            System.out.println("Write here instruction for Generic Exception");
        }
        catch (ArithmeticException e){
            System.out.println("This is a Arithmetic exception");
            System.out.println("Write here instruction for Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is a ArrayIndexOutOfBoundsException");
            System.out.println("Write here instruction for ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("Exception try catch block performed");
        }
    }
}
```
Output:
```output
Compiler error
```
**Conclusion** <br>
As the `Exception` is a parent class and `ArithmeticException` and `ArrayIndexOutOfBoundsException` are child class so we should write the parent class catch block after the Child Class exception.


