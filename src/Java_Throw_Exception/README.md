# Throw and Throws in Java

## Throw
Whenever we need to handle our own Exception we use throw key word. `handle our own Exception` means

1. Customize Exception cause & message
2. Customize New Exception

#### Customize Exception cause:
Suppose you want to make a video but kids are not supposed to see that because in that video there is lots of blood scene and slang word are used. So when a user enter his/her age if that is below 14 then you will make Exception and do not interrupt the program but handle the exception by providing a good message.

here you can make a new rules for your exception.
to do that you have to first think which type of Exception it will be. Suppose you think it will be ArithmeticException. 
So this is how you will handle it 

#### Example 1

```java
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

```
Output:
```output
Exception caught: Kids are not allowed to watch this video
rest of the code..
```
**Conclusion** <br>
I make a new Exception for my Validation method. And in main method I handle the Exception by using `try-catch` block.
by using `throw new [Exception_name(exception_message)]` you can create a Exception. And you need to obviously handle in which function it will be called .

**_In this part we also try to understand throws._** 

We learn previously there are two kind of exception 
1. **Checked** (Compile time Exception {IOException,FileNotFoundException})
2. **Unchecked** (Run Time Exception {ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException})

Now we need to understand one more thing that is `Propagation`.
Propagation in Exception is simply flow of exception handling.
When we throw an Exception from a method we need to write throws after the method name and set the Exception to maintain the proper way of exception handling. like the below code snippet.

```java
public static void validate(int age) throws ArithmeticException{
        if(age<14) {
            throw new ArithmeticException("message");
        }
        else {
            //some code
        }
    }
```
So Now might you have a question in your mind that in example 1 we did not declare throws but right now i am writing throws!  
it is very confusing at the beginning. 

in Unchecked Exception we do not need to write throws because it is maintain by default but you can write throws anyway it will not create any error message never mind.
Other-hand, in Checked Exception we must include throws otherwise your code will not work.

#### Example2
```java

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JTEExample2 {
    public static void main(String[] args) {
        try{
            method();
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }
        System.out.println("Rest of the code");
    }
    public static void method() throws FileNotFoundException{
        FileReader file= new FileReader("C:\\Users\\Rajwan\\Desktop\\Imran(2023)\\JavaPractice\\ExceptionHandling\\src\\Java_Throw_Exception\\abc.txt"); //it is a path for where your file is stored 
        BufferedReader fileInput= new BufferedReader(file);
        throw new FileNotFoundException();
    }
}
```
in the above example we are using throws in the method() function because in method() function we throw a new Exception. as this exception is an `Unchecked` Exception so i must need to add throws in this method to throw the exception in main method.



## Customized New Exception (User Defined Exception)
As far now we were working with the Exception class which Java built in class now we will learn how can we make our own Java Exception class like -> `ArithmeticException`,`NullPointerException`,`SQLException` etc

Creating a custom Exception is very easy! all you need to extends a Exception class. 
usually For making an Checked custom Exception we extend `Exception`
```Java
class UserDefinedException extends Exception{
    UserDefinedException(String str){
        super(str);
    }
}
```

and for making an unchecked Custom Exception we usually extends `RuntimeException`
```java
class UserDefinedException extends RuntimeException {
    UserDefinedException(String str) {
        super(str);
    }
}
```
After that everything are as same everything here a another example to make better understanding 

### Example 3
```java
class UserDefinedException extends Exception{
    UserDefinedException(String str){
        super(str);
    }
}
```
```java
public class JTEExpample3 {
    public static void method() throws UserDefinedException{
        throw new UserDefinedException("This is a UserDefined Exception");
    }
    public static void main(String[] args) {
        try{
            method();// here is our Exception code in this method
        }catch (UserDefinedException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
```

Output:
```output
Caught Exception: This is a UserDefined Exception
Rest of the code
```

**Conclusion**<br>
as this is a Checked Exception as we extends from `Exception` not form `RuntimeException` or any other unchecked exception. So that is why we must need to use throws keyword whenever we throw a new Exception to catch this new exception from any other method or main method. 


**Here is another last example to understand userdefined Exception** 
#### Example 4
```java
class GenderException extends Exception {
    GenderException(String str) {
        super(str);
    }
}
```
```java
public class JTEExample4 {
    public static void genderHandler(String str) throws GenderException {
        if (str.equals("female")) {
            throw new GenderException("No Females are allowed here");
        } else {
            System.out.println("You are good to go...");
        }
    }

    public static void main(String[] args) {
        try {
            genderHandler("female");
        } catch (GenderException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Try-catch block performed succesfully");
        }
        System.out.println("Rest of the code");
    }
}
```
Output:
```output
Exception caught: No Females are allowed here
Try-catch block performed succesfully
Rest of the code
```

## Thank you