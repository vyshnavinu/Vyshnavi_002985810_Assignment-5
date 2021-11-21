/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount user : userAccountList)
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
        public UserAccount createUserAccount(String name, String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);         
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount user : userAccountList){
            if (user.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteUserAccount(UserAccount user){
        userAccountList.remove(user);
    }
    
    public void updateUserAccount(UserAccount user, String name, String username, String password){
       
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
    }

    public void removeAllAccounts() {
        for (int i = 0; i < userAccountList.size(); i++) {
            if (!userAccountList.get(i).getUsername().equalsIgnoreCase("admin")) {
                userAccountList.remove(i);
            }
        }

        for (int i = 0; i < userAccountList.size(); i++) {
            System.out.println(userAccountList.get(i).getEmployee());
        }
    }
}
