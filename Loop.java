public class Loop {
    public static void main(String[] args) {
        int num = 1234;
        int copy = num;
        int count = 0;
        // count the digits
        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
        int pow = 1;
        while (count > 1) {
            pow = pow * 10;
            count--;
        }
        System.out.println(pow);
        while (copy != 0) {
            System.out.println(copy / pow);
            copy = copy % pow;
            pow = pow / 10;

        }

    }

}
