package Java_Throw_Exception;
//Throwing user-defined exception
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
class UserDefinedException extends Exception{
    UserDefinedException(String str){
        super(str);
    }
}
