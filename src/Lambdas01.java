interface Sayable01 {

    public String say();
}

public class Lambdas01 {

    public static void main(String[] args) {
        Sayable01 s = () -> {
            return "I have nothing to say.";
        };

        System.out.println(s.say());
    }
}
//Java Lambda Expression Example: No Parameter
