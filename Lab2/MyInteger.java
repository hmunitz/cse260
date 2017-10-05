package Lab2;
/**
  Created by cebo4 on 9/12/2017.
 */
public class MyInteger {
    private int value;

    public MyInteger(int n){
        value = n;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return isEven(value);
    }

    public boolean isOdd(){
        return isOdd(value);
    }

    public boolean isPrime(){
        return isPrime(value);
    }

    public static boolean isEven(int n){
        return n % 2 == 0 ? true : false;
    }

    public static boolean isOdd(int n){
        return n % 2 != 0 ? true : false;
    }

    public static boolean isPrime(int n){
        if(n < 0)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger n){
        return n.isEven();
    }

    public static boolean isOdd(MyInteger n){
        return n.isOdd();
    }

    public static boolean isPrime(MyInteger n){
        return n.isOdd();
    }

    public boolean equals(int n){
        return value == n;
    }

    public boolean equals(MyInteger n){
        return value == n.getValue();
    }

    public static int parseInt(String s){
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            num *= 10;
            num += Character.getNumericValue(s.charAt(i));
        }
        return num;
    }

}
