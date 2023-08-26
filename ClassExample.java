//encapsulation = Binding data and methods into a single unit, this is a class
class Student {
    // Name of class shouls start with capital letter
    // should be a noun
    // deafult scope = within the package scope
    private int rollNo;// instance variables, jab tak new nahi likhenge jab tak nhi chalega
    // private scope is wirhin the class
    // doing tata hiding
    private String name;

    private boolean isValid(int rollNo) {
        if (rollNo <= 0) {

            return false;
        }
        return true;

    }

    public void takeInput(int rollNo, String name) {// r and n are local variable
        if (!isValid(rollNo)) {
            System.out.println("Invalid Rollno.");
            return;
        }

        this.rollNo = rollNo;
        this.name = name;
        // instance variable = local variable

    }

    public void print() {// public rakhna chahie scope to access within and outside class
        // this is a keyword, it holds the current calling object
        // this likhna optional hai,
        System.out.println("name " + name);
        System.out.println("id   " + rollNo);
        System.out.println("*****************");

    }

}

public class ClassExample {
    public static void main(String[] args) {
        // amit is a variable of student type(class)
        Student amit = new Student();// new student create object in a heap
        amit.takeInput(1001, "amit");
        amit.print();
        // new is a keywoed to allocate a memory
        // System.out.println(amit.rollNo);
        Student abhay = new Student();
        abhay.takeInput(1002, "Abhay");
        abhay.print();
        // nayi memory create hogyi dubara
        // amit and abhay are reference variables
    }

}
