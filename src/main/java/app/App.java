package app;

import lombok.Getter;
import lombok.Setter;
import model.Product;

@Setter
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Java Promotions -> el resultado se promueve
        byte a = 5;
        byte b = 6;
        byte c = (byte) (a + b);

        Integer agen = null;
        Integer age = 22;
        int ageInt = 11;
        String name = age.toString();

        // nuevo valor
        Product p = new Product();


        p.setName(name);
        System.out.println(p.getName());

    }

}
