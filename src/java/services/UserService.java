package services;

import dataaccess.userDB;
import java.util.List;
import models.Role;
import models.User;

/**
 *
 * @author roker
 */
public class UserService {

    public List<User> getAllUsers() throws Exception {
        userDB userDB = new userDB();
        List<User> users = userDB.getAllUsers();
        return users;
    }

    public User getUser(String email) throws Exception {
        userDB userDB = new userDB();
        User user = userDB.getUser(email);
        return user;
    }

    public void insertUser(String email, String fname, String lname, String pass,
            Role role) throws Exception {
        userDB userDB = new userDB();
        User user = new User(email, fname, lname, pass, role);
        userDB.insertUser(user);
    }

    public void updateUser(String email, String fname, String lname, String pass,
            Role role) throws Exception {
        userDB userDB = new userDB();
        User user = new User(email, fname, lname, pass, role);
        userDB.updateUser(user);
    }

    public void deleteUser(String email) throws Exception {
        userDB userDB = new userDB();
        User user = new User();
        user.setEmail(email);
        userDB.deleteUser(user);
    }

    public boolean isNotEmpty(String email, String firstname, String lastname, String password) {
        if (email == null || email.equals("") || firstname == null || firstname.equals("") || lastname == null || lastname.equals("") || password == null || password.equals("")) {
            return false;
        }
        return true;
    }

}
