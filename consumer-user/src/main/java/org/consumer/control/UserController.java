package org.consumer.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yzx96
 *
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String butTicket(String name){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket/", String.class);
        return name+"购买了"+s;
    }
}
