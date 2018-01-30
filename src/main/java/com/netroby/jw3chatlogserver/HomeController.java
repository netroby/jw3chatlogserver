package com.netroby.jw3chatlogserver;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
/**
 * @author ZhiFeng Hu <hufeng1987@gmail.com>
 */
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}