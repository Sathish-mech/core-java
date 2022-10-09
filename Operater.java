public class Operater{
    public static void main(String args[]){
        int a=15;
        int b=25;
        int x=14;
        int y=25;
        //bodmas
        System.out.println(a++);
        System.out.println(a);
        System.out.println(b++);
        System.out.println(a++ + ++a);
        System.out.println(a);
        System.out.println(b++ + ++b);
        System.out.println(++a);
        System.out.println(++b);
        System.out.println(++b + b++);
        System.out.println(x++);
        System.out.println(++x + x++);
        System.out.println(--x);
        System.out.println(--x - x--);
    }
}