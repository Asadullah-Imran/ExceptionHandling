package Java_Throw_Exception;

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

class GenderException extends Exception {
    GenderException(String str) {
        super(str);
    }
}
