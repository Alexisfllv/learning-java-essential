package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private LocalDateTime moment;
    private Status status;
    private Client client;
    private List<OrderItem> items;


    public void addItem(OrderItem item){
        items.add(item);
    }

    // metodo total
    private double total(){
        double total = 0;
        for (OrderItem item : items){
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    // sobreescritura de toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment : ");
        sb.append(moment).append("\n");
        sb.append("Order status : ");
        sb.append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order Items : \n");

        // foreachs
        items.forEach(item -> sb.append(item).append("\n"));
        sb.append("Total Price : /S ");
        sb.append(total());

        return sb.toString();
    }
}
