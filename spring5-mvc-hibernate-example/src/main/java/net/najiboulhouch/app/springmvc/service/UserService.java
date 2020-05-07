package net.najiboulhouch.app.springmvc.service;

import java.util.List;

import net.najiboulhouch.app.springmvc.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
