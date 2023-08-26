import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = x.length();
        int oddSum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            oddSum = oddSum + i;
        }
        System.out.println("The sum of odd places of the number is " + oddSum);

        int evenSum = 0;
        for (int i = 0; i <= n; i = i + 2) {
            evenSum = evenSum + i;
        }
        System.out.println("The sum of even places of the number is " + evenSum);

    }
}
