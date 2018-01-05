@FunctionalInterface
interface Sayable06{
    String say(String message);
}


public class Lambdas06{
    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression
        Sayable06 person = (message)-> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
//Java Lambda Expression Example: Multiple Statements