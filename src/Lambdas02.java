interface Sayable02{
    public String say(String name);
}

public class Lambdas02{
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable02 s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable02 s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
//Java Lambda Expression Example: Single Parameter