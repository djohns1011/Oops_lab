//Write a file handling program in Java with reader/writer.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderWriter {
    public static void main(String [] args) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the data: ");
            String str = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");

            for (int i = 0; i < str.length(); i++){
                fw.write(str.charAt(i)) ;
            }
            System.out.println("Writing successful");
            fw.close();
        }
        try {
            FileReader fr = new FileReader("output.txt");
            System.out.println("Content of the file: ");
            int i = 0;
            while((i = fr.read()) != -1) 
            {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println(" an Error occurred");
        }
    }
}
//
