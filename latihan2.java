import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = reader.nextLine();

        System.out.print("Selamat Pagi, " + getFirstName(fullName) + "!");
    }

    public static String getFirstName(String fullName) {
        return fullName.substring(0, fullName.indexOf(' '));
    }

}