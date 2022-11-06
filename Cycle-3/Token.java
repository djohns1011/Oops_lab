import java.util.*;
public class Token {
   public static void main(String[] args){
    int sum = 0;
    String a;
    int i;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the integers with spaces between each: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println(a=st.nextToken());
            i = Integer.parseInt(a);
            sum+=i;
        }
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    System.out.println("Sum of Integers = "+ sum);
   }
}
