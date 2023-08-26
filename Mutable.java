public class Mutable {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Abhay");
        System.out.println(sb.capacity()); // 16 + length of string buffer ie 5 so 21
        System.out.println(sb.length());
        sb.append("Khokhar , Delhi - 7"); /*
                                           * it exceed the total capacity ie 21 so it creates new capacity i.e. old
                                           * capacity * 2 + 2.
                                           * agar new capacity bhi exhaust ho jaati hai to nayi capacity utni banao
                                           * jitni
                                           * length hai or agar phirse nayi capacity banegi to vo dubara formula lagake
                                           * banegi and the process will keep going
                                           */

        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }

}
