import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product08 {
    int id;
    String name;
    float price;
    public Product08(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Lambdas08{
    public static void main(String[] args) {
        List<Product08> list=new ArrayList<Product08>();

        //Adding Products
        list.add(new Product08(1,"HP Laptop",25000f));
        list.add(new Product08(3,"Keyboard",300f));
        list.add(new Product08(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product08 p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

    }
}
//Java Lambda Expression Example: Comparator