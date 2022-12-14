package com.testwithspring.master.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String ShowMessage() {
        LOGGER.info("Rendering show message view");
        return "index";
    }

    @GetMapping("/hi/")
    public String ShowHi(){
        return("Hello World!");
    }
}
