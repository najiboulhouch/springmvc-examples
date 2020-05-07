package net.najiboulhouch.app.springmvc.dao;

import java.util.List;

import net.najiboulhouch.app.springmvc.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
