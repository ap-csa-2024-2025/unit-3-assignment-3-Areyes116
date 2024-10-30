import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Problem 1
        System.out.println("Enter two numbers for Problem 1:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y == 0)
        {
            System.out.println("Arithmetic exception");
        } else
        {
            double ratio = (double) x / y;
            if (1 < ratio && ratio <= 8) {
                System.out.println("Ratio OK");
            }
        }

        // Problem 2
        System.out.println("Enter two numbers for Problem 2:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0)
        {
            System.out.println("Divide by 0 error");
        } else if (a % b == 0)
        {
            System.out.println("Is a factor");
        }

        // Problem 3
        System.out.println("Enter a number in the fifties for Problem 3:");
        int num = sc.nextInt();

        if (num < 50 || num > 59)
        {
            num = 55;
            System.out.println("That's not in the fifties!");
        }

        System.out.println("Your number is " + num);

        // Problem 4
        System.out.println("Enter two numbers for Problem 4:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (y <= 9 || (x > 2 && x * y > 10))
        {
            System.out.println("pass");
        }

        sc.close();
    }
}
