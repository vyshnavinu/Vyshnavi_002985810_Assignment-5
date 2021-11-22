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
    private ArrayList<Menu> Menu;
    private ArrayList<Order> orderList;
    int id = 101;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Menu> Order, String cost, String deliveryAddress) {
        Order order = new Order();
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
        return Menu;
    }
    
     public void setMenu(ArrayList<Menu> Menu) {
        this.Menu = Menu;
    }

    public void addDishes(Menu menu) {
        Menu.add(menu);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void removeDishes(Menu menu) {
        Menu.remove(menu);
    }

    public String getAdminUName() {
        return adminUName;
    }

    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public Restaurant(String UName) {
        this.adminUName = UName;
        Menu = new ArrayList<Menu>();
        orderList = new ArrayList<Order>();
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

    @Override
    public String toString() {
        return name;
    }
}
