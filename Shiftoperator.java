public class Shiftoperator{
    public static void main(String args[]){
        int x = 4;
        System.out.println("Right shift is " + (x>>2));
        System.out.println("Right shift with zero fill is " +(x>>>2));
        System.out.println("left shift is " +(x<<2));
    }
}