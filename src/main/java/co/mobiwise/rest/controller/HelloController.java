package co.mobiwise.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yusuf on 1/13/16.
 */
@Controller
@RequestMapping("/api")
public class HelloController {

    @RequestMapping
    @ResponseBody
    String sayHi(){
        return "hi";
    }
}
