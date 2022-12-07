import java.util.Scanner;
public class Text {
    public static void main(String[] args){
        String text;
        int count;
        char ch;

        Scanner input = new Scanner(System.in);
        System.out.println("Write something here ...");
        text = input.nextLine();
        text = text.toUpperCase();

        count = 0;
        System.out.println("Your text in alphabet order is ...");
        for(ch = 'A'; ch <= 'Z'; ch++){
            for(int i = 0; i < text.length(); i++){
                if(ch == text.charAt(i)){
                    System.out.println(ch + " ");
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total number of the letters used are " + count);
    }
}
