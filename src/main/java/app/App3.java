package app;

import lombok.Cleanup;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        @Cleanup Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name =  sc.nextLine();
        System.out.print("email: ");
        String email = sc.nextLine();
        System.out.print("birthdate: (YYYY-MM-DD) ");
        String birthdate = sc.nextLine();

        Client c = new Client(name,email,LocalDate.parse(birthdate));
        System.out.println(c);

        // datos de orden

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        Status status = Status.valueOf(sc.nextLine());
        // fecha
        LocalDateTime fecha =  LocalDateTime.now();
        Order order = new Order(fecha,status,c,new ArrayList<>());


        System.out.println(" How many items to this order? ");
        int numberOfItems = sc.nextInt();

        for (int i = 1 ; i<= numberOfItems ; i++){
            System.out.println("Enter #"+i+" item data:");
            System.out.println("name nm: ");
            String namep = sc.next();
            System.out.println("price: ");
            double price = sc.nextDouble();
            System.out.println("quantity: ");
            int quantity = sc.nextInt();

            //
            Product p = new Product(namep,price);
            OrderItem oi = new OrderItem(quantity,price,p);
            order.addItem(oi);
        }

        System.out.println("ORDER SUMARY");
        System.out.println(order);


    }
}
