import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();

        int bookPages = (int) 100-age;

        System.out.printf("%d-year olds should read %d pages before giving up on a book", age, bookPages);

    }
}
