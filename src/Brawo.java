import java.util.Scanner;

public class Brawo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        for (int i = 0; i<=4; i++) {
            System.out.println("Brawo, " + name);

        }
    }
}
