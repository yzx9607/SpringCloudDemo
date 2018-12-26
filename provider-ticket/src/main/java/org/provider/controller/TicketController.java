package org.provider.controller;
import org.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TicketController {
	
    @Autowired
    private TicketService ticketService;

    // SpringCloud 整合微服务时是按照轻量级的HTTP进行通信
    @GetMapping("/ticket")
    public String getTicker(){
        return ticketService.buyTicket();

    }
}
