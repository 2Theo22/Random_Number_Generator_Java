import java.util.Scanner;
import java.util.Random;



class Main{
    static Scanner input = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String[] args){
        System.out.print("Welcome\nWhat do you want to do?\n1. Generate Random Number\n2. Exit\nEnter your choice (1|2): ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 2){
            System.out.print("\nClosing Program...");
        }
        else if (choice == 1) {
            while(true) {
                int number = generator();
                System.out.println("Generated number: "+number);
                System.out.print("Generate another number?\n1. Yes\n2. No\nEnter (1|2): ");
                int y = input.nextInt();
                input.nextLine();
                if (y == 2){
                    break;
                }
            }
        }
    }

    private static int generator(){
        System.out.print("Enter the Interval you want to use\n Minimum Number: ");
        int min = input.nextInt();
        input.nextLine();
        System.out.print(" Maximum Number: ");
        int max = input.nextInt();
        input.nextLine();
        if(min >= max){
            System.out.println("Error: Why you pick a max smaller than min???");
            return 0;
        }
        return r.nextInt(min, max);
    }
}