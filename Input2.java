import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Your Name");
        System.out.println("Your Name is " + name);
        sc.close();

    }

}
