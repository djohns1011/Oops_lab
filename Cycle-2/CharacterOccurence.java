import java.util.Scanner;
class CharacterOccurence {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String string = sc.nextLine();
            char str[] = string.toCharArray();
            System.out.print("Enter the character: ");
            char x = sc.next().charAt(0);
            int count = 0;
            int j = str.length;
            for(int i = 0; i < j ; i++){
                if (str[i] == x) {
                    count++;
                }
            }
            System.out.println("Character frequency of "+ x +" : " + count);
        }
    }
}