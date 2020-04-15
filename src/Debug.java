import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        String name;
        int Age;
        int dob;

        Scanner input = new Scanner(System.in);

        System.out.print("Input your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: " );
        Age = input.nextInt();
        System.out.print("Enter your DOB year: ");
        dob = input.nextInt();


        System.out.println("Summary: " + "Your name is: " + name + "\n" + "Your age is: "
                + Age + "\n" + "Your birth year is: " + dob);
    }
}
