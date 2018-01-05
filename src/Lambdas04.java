interface Addable04{
    int add(int a,int b);
}

public class Lambdas04 {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable04 ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable04 ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
//Java Lambda Expression Example: with or without return keyword
