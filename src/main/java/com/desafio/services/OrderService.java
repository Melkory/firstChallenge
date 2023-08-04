package com.desafio.services;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.entities.Order;

@Service
public class OrderService {

	
	@Autowired
	private ShippingService shippingService;
	
	public double total (Order order) {
		double totalShip = order.getBasic() - (order.getBasic() * (order.getDiscount()/100)) + shippingService.shipment(order);
		return totalShip;
	}
}
