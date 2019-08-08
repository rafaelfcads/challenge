package com.tempo.challenge;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.Book;
import com.tempo.challenge.entity.user.Level;
import com.tempo.challenge.entity.user.MemberShip;
import com.tempo.challenge.entity.user.Status;
import com.tempo.challenge.entity.user.User;
import com.tempo.challenge.service.order.OrderService;

public class App {
	
    public static void main( String[] args ) {
        
        Order order = new Order(1234l, new User(new MemberShip(Status.DISABLED, Level.BASIC)), new Book(345l, "bakdhabvk"));
        new OrderService().process(order);
 
    }
}
