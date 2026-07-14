import javax.print.attribute.standard.MediaSize;
import java.util.Objects;
import java.util.Scanner;

import static java.util.Objects.requireNonNull;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        String S = new String();
        Integer I = new Integer(5);
        Boolean B = new Boolean(true);
        Double D = new Double(22.5);
        Object[] O = new Object[]{S, I, B, D, null};
        for (Object obj : O) {
            inspect(obj);


        }


        Product P1 = new Product("Iphone", 2, 500);
        Product P2 = new Product("Iphone", 2, 550);

        System.out.println(P1.equals(P2));


        Product P3 = new Product("Laptop", 56, 500);
        Product P4 = new Product("Screen", 550, 822);

        System.out.println(P3.equals(P4));


    }


    static void inspect(Object obj) {

        if (obj == null) {
            System.out.println("[null]");
            return;
        }


        System.out.println(obj.getClass().getSimpleName());

        if (obj instanceof String) {
            System.out.println("the Type is String ");
        }
        if (obj instanceof Boolean) {
            System.out.println("the Type is Boolean ");
        }
        if (obj instanceof Integer) {
            System.out.println("the Type is Integer ");
        }
        if (obj instanceof Double) {
            System.out.println("the Type is Double ");
        }


        System.out.println("the Type is Other ");


        System.out.println("the Value is " + obj.toString());
    }

}