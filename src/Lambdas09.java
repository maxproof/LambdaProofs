
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product09{
    int id;
    String name;
    float price;
    public Product09(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Lambdas09{
    public static void main(String[] args) {
        List<Product09> list=new ArrayList<Product09>();
        list.add(new Product09(1,"Samsung A5",17000f));
        list.add(new Product09(3,"Iphone 6S",65000f));
        list.add(new Product09(2,"Sony Xperia",25000f));
        list.add(new Product09(4,"Nokia Lumia",15000f));
        list.add(new Product09(5,"Redmi4 ",26000f));
        list.add(new Product09(6,"Lenevo Vibe",19000f));

        // using lambda to filter data
        Stream<Product09> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}
//Java Lambda Expression Example: Filter Collection Data