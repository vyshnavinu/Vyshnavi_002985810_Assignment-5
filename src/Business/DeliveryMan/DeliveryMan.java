/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.Menu;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String Name;
    private String UserName;
    private Image picture;
    private ArrayList<Order> orderList;
     
    public void addOrder(String restaurantName, String customerName, String deliveryMan, ArrayList<Menu> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliverMan(deliveryMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    private String address;
    private String number;

    public DeliveryMan(String UserName){
        this.UserName=UserName;
        orderList=new ArrayList<Order>();
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
    @Override
    public String toString() {
        return UserName;
    }
}
