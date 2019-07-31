package Java;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n =10;
        int i =1;
        int a =0;
        int b =1;

        System.out.print("fibonacci number till "+n+" are :");
        while(i <=n){
            System.out.print(a +", ");

        int sum = a+b;
        a=b;
        b=sum;
        i++;
    }
    }
}
