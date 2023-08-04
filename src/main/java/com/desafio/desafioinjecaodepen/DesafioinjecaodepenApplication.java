package com.desafio.desafioinjecaodepen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.Locale;
import com.desafio.services.OrderService;
import com.desafio.entities.Order;

@SpringBootApplication
@ComponentScan({"com.desafio"})
public class DesafioinjecaodepenApplication implements CommandLineRunner {
	
	
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioinjecaodepenApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$" + String.format("%.2f", orderService.total(order)));
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$" + String.format("%.2f", orderService.total(order2)));
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$" + String.format("%.2f", orderService.total(order3)));
	}

}
