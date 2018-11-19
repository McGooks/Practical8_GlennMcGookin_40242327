import java.util.Scanner;

public class Part1_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name: ");
        String name = input.next();
        char [] characters = new char[name.length()];
        for(int i = 0; i < name.length(); i++){
            characters[i] = name.charAt(i);
        }
    }

}
