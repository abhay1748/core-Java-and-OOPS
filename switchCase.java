import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        final int BURGER = 1;
        final int PIZZA = 2;
        final int DRINKS = 3;
        final int DESSERT = 4;
        final int EXIT = 5;

        System.out.println("1. Burger");
        System.out.println("2. pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Dessert");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "BURGER":
                System.out.println("Price is $100");
                break;
            case "PIZZA":
                System.out.println("Price is $1000");
                break;

            case "DRINKS":
                System.out.println("Price is $10000");
                break;

            case "DESSERT":
                System.out.println("Price is $100000");
                break;

            case "EXIT":
                System.out.println("Thankyou");

        }
    }

}
