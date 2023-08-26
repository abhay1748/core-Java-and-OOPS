import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;

            ans = (ans * 10) + digit;
            x = x / 10;
        }
        System.out.println("Reverse of the number is " + ans);
        sc.close();

    }
}
