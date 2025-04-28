package app;

import model.Customer;
import model.Product;

public class App2 {
    public static void main(String[] args) {

        Customer c1 =  new Customer(1,"dem",true);
        Customer.CustomerBuilder c2 = Customer.builder().idCustomer(2);
        c2.name("dem2");

        System.out.println(c2.build());

        Product.ProductBuilder p1 = Product.builder();
        p1.name("p1");
        System.out.println(p1.build());



    }
}
