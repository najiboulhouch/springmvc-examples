package net.najiboulhouch.app.springmvc.security.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * @author NAJIB
 * @version 1.0
 */

@Controller
public class HomeContoller {

  @GetMapping("/")
  public String index(Model model, Principal principal) {
    model.addAttribute("message", "You are logged in as " + principal.getName());
    return "index";
  }
}
