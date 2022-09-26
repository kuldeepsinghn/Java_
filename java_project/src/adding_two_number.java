import java.util.Scanner;
public class adding_two_number
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        System.out.println("The sum of a and b is "+ (a+b));
    }
}

