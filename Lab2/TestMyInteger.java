package Lab2;
import java.util.Random;
/**
 * Created by cebo4 on 9/12/2017.
 */
public class TestMyInteger {

    public static void main(String[] args){
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("n="+n);
        MyInteger myInt = new MyInteger(n);
        System.out.println("myInt="+myInt.getValue());
        System.out.println("myInt isEven:"+myInt.isEven());
        System.out.println("myInt isOdd:"+myInt.isOdd());
        System.out.println("myInt isPrime:"+myInt.isPrime());
        System.out.println("4 isEven:"+MyInteger.isEven(4));
        System.out.println("4 isOdd:"+MyInteger.isOdd(4));
        System.out.println("4 isPrime:"+MyInteger.isPrime(4));
        System.out.println("3 isEven:"+MyInteger.isEven(3));
        System.out.println("3 isOdd:"+MyInteger.isOdd(3));
        System.out.println("3 isPrime:"+MyInteger.isPrime(3));
        System.out.println("MyInteger isEven"+MyInteger.isEven(myInt));
        System.out.println("MyInteger isOdd"+MyInteger.isOdd(myInt));
        System.out.println("MyInteger isPrime"+MyInteger.isPrime(myInt));
        System.out.println("myInt == n:"+myInt.equals(n));
        System.out.println("myInt == n+1:"+myInt.equals(n+1));
        System.out.println("(String 462 = int: "+MyInteger.parseInt("462"));
    }
}
