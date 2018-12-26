package org.provider.service.impl;

import org.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class TicketServiceImpl implements TicketService {
	@Value("${server.port}")
	private String port;
	public String buyTicket() {
		System.out.println(port);
		return "《疯狂的石头》";
	}

}
