package Lab2;
import java.util.Scanner;
/**
 * Created by cebo4 on 9/12/2017.
 */
public class TestComplex {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("a?");
        int a = Integer.parseInt(input.next());
        System.out.println("b?");
        int b = Integer.parseInt(input.next());
        System.out.println("c?");
        int c = Integer.parseInt(input.next());
        System.out.println("d?");
        int d = Integer.parseInt(input.next());
        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(c, d);
        System.out.println("c1+c2 = " + c1.add(c2));
        System.out.println("c1-c2 = " + c1.subtract(c2));
        System.out.println("c1*c2 = " + c1.multiply(c2));
        System.out.println("c1/c2 = " + c1.divide(c2));
    }
}
