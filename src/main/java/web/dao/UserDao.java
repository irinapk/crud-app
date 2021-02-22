package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    void removeUserById(int id);

    void update(int id, User newUser);

    User show(int id);
}


