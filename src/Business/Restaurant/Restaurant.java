/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String adminUName;
    private Image picture;
    private ArrayList<Menu> menu;
    private ArrayList<Order> orderList;
    
    int id=101;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Menu> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurentName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    public ArrayList<Menu> getMenu() {
        return menu;
    }
    
    public void addDishes(Menu menu){
        //menu.add(menu);
    }
    
    public void removeDishes(Menu menu){
        
        //menu.remove(menu);
    }

    public String getAdminUName() {
        return adminUName;
    }
    
    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public Restaurant(String UName) {
        this.adminUName=UName;
        menu=new ArrayList<Menu>();
        orderList=new ArrayList<Order>();
    }
  
    private String name;
    private String address;
    private String number;

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
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public Object getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
