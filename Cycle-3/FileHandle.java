import java.io.*;
import java.util.*;
public class FileHandle {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
                FileOutputStream fo = new FileOutputStream("output.txt");
                System.out.print("Enter the string: ");
                String str = sc.nextLine();
                byte[] array = str.getBytes();
                fo.write(array);
                fo.close();
                System.out.println("File created successfully");
        }
        catch(IOException e){
                System.out.println("An Error occurred");
        }
        try{
            FileInputStream fr = new FileInputStream("output.txt");
            System.out.print("File Content: ");
            int i=0;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("An error Occurred");
        }
    }
}
