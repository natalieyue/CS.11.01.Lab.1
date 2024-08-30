import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:\t");
        int age = scanner.nextInt();

        int minDateAge = (int) (age / 2.0) + 7;

        System.out.printf("%d-year olds should date somebody who is at least %d years old.%n", age, minDateAge);



    }
}
