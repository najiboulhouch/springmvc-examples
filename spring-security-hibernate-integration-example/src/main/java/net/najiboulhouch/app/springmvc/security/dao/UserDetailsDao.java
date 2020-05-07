package net.najiboulhouch.app.springmvc.security.dao;

import net.najiboulhouch.app.springmvc.security.model.User;
/**
 * 
 * @author NAJIB
 * @version 1.0
 */

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
