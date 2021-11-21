/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private Menu menu;
    
    public RestaurantDirectory(){
        this.restaurantList=new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant createRestaurantInfo(String uName){
        restaurant= new Restaurant(uName);
        restaurantList.add(restaurant);
        
        return restaurant;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getAdminUName().equals(username)){
                restaurantList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(Restaurant rest, String name, String number, String address){
        rest.setName(name);
        rest.setAddress(address);
        rest.setNumber(number);
    }
    
    public Menu AddMenuDishes(Restaurant rest, String name, String desc, String amount){
        menu = new Menu(name, desc, amount);
        rest.addDishes(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant rest, Menu menu){
        rest.removeDishes(menu);  
    }
}
