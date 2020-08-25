import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name? ");
        String name = input.nextLine();
        System.out.println("Nice to meet you, "+ name + ", How has your day been? ");
        String day = input.nextLine();

        System.out.println("Okay, Anything in particular that makes you feel that "+  day  +" ! ?");
        String detail = input.nextLine();
        System.out.print("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.print("\nHere are your responses: " + name + " " +day+ "　" + detail);

    }
}

