package com.springmvc.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String main() {
        return "main-menu";
    }

    @RequestMapping("/showform")
    public String index() {
        return "helloworld";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String welcome(HttpServletRequest request, Model model) {

        String theName = request.getParameter("name");
        theName = theName.toUpperCase();
        String result = "Hi, " + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }
}
