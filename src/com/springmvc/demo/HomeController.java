package com.springmvc.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HomeController {

    @RequestMapping("/showform")
    public String index() {
        return "helloworld";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String processFormTwo(@RequestParam("na" +
            "" +
            "me") String theName, Model model) {

        theName = theName.toUpperCase();
        String result = "Hi, " + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

//    @RequestMapping("/processFormThree")
//    public String processFormThree(HttpServletRequest request, Model model) {
//
//        String theName = request.getParameter("name");
//        theName = theName.toUpperCase();
//        String result = "Hi, " + theName;
//
//        model.addAttribute("message", result);
//
//        return "helloworld";
//    }
}
