public class RefDemo {
    public static void main(String[] args) {
        String name = "Abhay";
        String name2 = name;
        System.out.println(name == name2);// true dega
        String name3 = new String("abhay");
        System.out.println(name == name3);
        // new ka matlab hai allocate new memory
        // is case mai name ne bas name2 ka address copy kia hai value nahi
        // name is a variable of string type
        // string is a CLASS which is a collection of chahacters while int is a DATATYPE
        // name is a reference variable
    }
}