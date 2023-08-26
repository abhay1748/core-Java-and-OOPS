public class rotate {
    public static void main(String[] args) {
        int num = 12345;
        int rot = 2;
        int countDigit = 0;
        int copy = num;
        while (copy != 0) {
            copy = copy / 10;
            countDigit++;
        }
        rot = rot % countDigit;// for large rotations
        if (rot < 0) {
            rot = rot + countDigit;// for negative rotations
        }
        int power = (int) Math.pow(10, rot);
        int leftPart = num / power;
        int rightPart = num % power;
        int count = countDigit - rot;
        int result = rightPart * (int) Math.pow(10, count) + leftPart;
        System.out.println(result);
        // System.out.print(rightPart);
        // System.out.print(leftPart);
    }

}
