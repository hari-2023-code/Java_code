import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.close();

            if (age < 0) {
                throw new Exception("Invalid age! Age cannot be negative.");
            }
            else if (age < 18) {
                throw new Exception("You are NOT eligible to vote (Below 18).");
            }
            else {
                System.out.println("You are eligible to vote. ");
            }

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}