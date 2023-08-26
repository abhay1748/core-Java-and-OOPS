import java.util.Scanner;

class marks {

    public double grade() {
        try (Scanner sc = new Scanner(System.in)) {
            double physicsMarks = sc.nextDouble();
            double chemMarks = sc.nextDouble();
            double mathsMarks = sc.nextDouble();
            double totalMarks = physicsMarks + chemMarks + mathsMarks;
            double percentage = totalMarks / 3;
            if (percentage >= 90.00) {
                System.out.println(" You Got Grade A");
            } else if (percentage >= 80 && percentage < 90) {
                System.out.println(" You Got Grade B");
            } else if (percentage >= 70 && percentage < 80) {
                System.out.println(" You Got Grade B");
            } else if (percentage >= 60 && percentage < 70) {
                System.out.println(" You Got Grade B");
            } else if (percentage >= 50 && percentage < 60) {
                System.out.println(" You Got Grade B");
            } else {
                System.out.println("You Failed");
            }
            System.out.print("Your percentage is ");
            return percentage;
        }

    }

}

public class oopsAssignment2 {
    public static void main(String[] args) {
        marks m = new marks();
        System.out.println(m.grade());

    }

}
