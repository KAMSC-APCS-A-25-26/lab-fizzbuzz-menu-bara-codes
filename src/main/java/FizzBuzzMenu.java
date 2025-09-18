import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args)
    {
        //scanner
        Scanner sc = new Scanner(System.in);

        // declare boolean variable
        boolean running = true;

        while (running)
        {
            System.out.println("----FizzBuzz Menu----");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    for(int j=0; j<=100; j++) {
                        if (j %3 == 0)
                        {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    for(int j=0; j<=100; j++) {
                        if (j %5 == 0)
                        {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.print("\n");
                    break;

                case 3:
                    for(int j=0; j<=100; j++) {
                        if (j %3 == 0 && j % 5 == 0)
                        {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.print("\n");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
            }


        }
    }
}