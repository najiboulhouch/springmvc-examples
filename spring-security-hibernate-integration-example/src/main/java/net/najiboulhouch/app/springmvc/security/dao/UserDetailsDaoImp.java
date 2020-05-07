package net.najiboulhouch.app.springmvc.security.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.najiboulhouch.app.springmvc.security.model.User;
/**
 * 
 * @author NAJIB
 * @version 1.0
 */

@Repository
public class UserDetailsDaoImp implements UserDetailsDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public User findUserByUsername(String username) {
    return sessionFactory.getCurrentSession().get(User.class, username);
  }
}
