package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForms() {
        return "helloworld";
    }

    //new a controller method to reada form data and
    //add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        String theLastName = request.getParameter("studentLastName");

        //convert the data to all caps
        theName = theName.toUpperCase();
        theLastName = theLastName.toUpperCase();

        //create the message
        String result = "Yo! " + theName + " " + theLastName;

        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
//adnotacja @RequestParam robi to samo co dzieje
// się w linijce gdzie przypisywana jest wartośc do zmiennej theName
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Hey my friend from v3! " + theName;

        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
}
