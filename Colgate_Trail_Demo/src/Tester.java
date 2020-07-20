import java.util.Scanner;

public class Tester {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("who are you?");
        String player = scanner.nextLine();
        System.out.println("your name is " + player);

        Demo demo = new Demo(player);
        demo.playGame();
    }
}
