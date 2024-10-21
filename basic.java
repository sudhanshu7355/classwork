class A{
    int a;
    static int b;
}
public class basic{
    public static void main(String[] args) {
        A a=new A();
        a.a=10;
        a.b=20;

        A b=new A();
        b.b=30;
        b.a=15;

        System.out.println(a.b);

    }
}