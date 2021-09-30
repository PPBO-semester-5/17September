import java.util.Scanner;

public class latihan1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Here StringBuffer is used to combine 3 strings into single
        StringBuffer fullName = new StringBuffer();
        fullName.append(firstName);
        fullName.append(" ");   // For space between names
        fullName.append(middleName);
        fullName.append(" ");   // For space between names
        fullName.append(lastName);
        System.out.println("Hello, " + fullName);
    }
}