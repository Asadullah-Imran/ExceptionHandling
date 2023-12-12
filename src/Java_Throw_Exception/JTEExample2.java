package Java_Throw_Exception;
//Throwing Checked Exception

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

        FileReader file= new FileReader("C:\\Users\\Rajwan\\Desktop\\Imran(2023)\\JavaPractice\\ExceptionHandling\\src\\Java_Throw_Exception\\abc.txt");
        BufferedReader fileInput= new BufferedReader(file);

        throw new FileNotFoundException();
    }

}
