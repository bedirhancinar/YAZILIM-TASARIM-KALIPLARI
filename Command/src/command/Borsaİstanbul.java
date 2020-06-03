package command;

import java.util.ArrayList;
import java.util.List;
public class Borsaİstanbul {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void borsaBaşlat(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}

