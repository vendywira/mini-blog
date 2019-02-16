package app.learn.miniblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class ClientBlogController {

  @GetMapping()
  public String helloWorld() {
    return "index";
  }
}
