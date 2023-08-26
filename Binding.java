class P1 {
    int x;

    P1() {
        x = 10;
    }

    void show() {
        System.out.println("P1 show....");

    }
}

class C1 extends P1 {
    int x;

    C1() {
        x = 20;
    }

    @Override
    void show() {
        System.out.println("C1 show...." + this.x);

    }
}

public class Binding {

    public static void main(String[] args) {
        P1 obj = new C1();// upcasting
        obj.show();
        System.out.println(obj.x);

    }

}
