/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;
import Business.Restaurant.Menu;
import java.util.ArrayList;

/**
 *
 * @author srivyshnavi
 */
public class Order {
    private String orderID;
    private String restaurantName;
    private String customerName;
    private String deliverMan;
    private ArrayList<Menu> Order;
    private String cost;
    private String status;
    private String deliveryAddress;
    
    
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(String deliverMan) {
        this.deliverMan = deliverMan;
    }

    public ArrayList<Menu> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Menu> Order) {
        this.Order = Order;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    @Override
    public String toString() {
        return orderID;
    }
}
