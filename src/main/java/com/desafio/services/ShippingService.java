package com.desafio.services;

import org.springframework.stereotype.Service;

import com.desafio.entities.Order;

@Service
public class ShippingService {
	
	public double shipment (Order order) {
		
		double freight = 0.0;
		
		if (order.getBasic() < 100.0) {
			freight = 20.0;
		}
		else if (order.getBasic() < 200.0) {
			freight = 12.0;
		}
		else {
			freight = 0.0;
		}
		return freight;
	}

}
