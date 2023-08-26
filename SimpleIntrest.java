import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        int pri;
        System.out.println("Enter Principle Amount");
        Scanner s = new Scanner(System.in);
        pri = s.nextInt();
        int roi;
        System.out.println("Enter rate of intrest");
        roi = s.nextInt();
        int time;
        System.out.println("Enter time period");
        time = s.nextInt();
        int si;
        si = (pri * roi * time) / 100;
        System.out.println("Total Simple Intrest Is " + si);
    }

}
