package com.tempo.challenge.service.order;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.MemberShip;
import com.tempo.challenge.entity.product.MemberShipStatus;
import com.tempo.challenge.entity.product.Product;
import com.tempo.challenge.entity.product.Video;
import com.tempo.challenge.entity.user.Level;
import com.tempo.challenge.entity.user.Status;
import com.tempo.challenge.entity.user.User;
import com.tempo.challenge.service.order.ActivateMemberShip;
import com.tempo.challenge.service.order.SendEmail;



public class SendEmailTest {
	
	private Long orderNumber;
	
	private User user;
	
	@Mock
	private ActivateMemberShip  activateMemberShip;
	
	@Before
    public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.orderNumber = 76374618l;
        this.user = new User(new com.tempo.challenge.entity.user.MemberShip(Status.DISABLED, Level.BASIC));
    }
	
	@Test
	public void shouldProcessWhenMemberShipProduct() {
		Product product = new MemberShip(MemberShipStatus.ACTIVATE);
		Order order = new Order(this.orderNumber, this.user, product);	
		SendEmail sendEmail = new SendEmail();
		
		boolean shouldProcess = sendEmail.shouldProcess(order);
		
		assertTrue(shouldProcess);
	}
	
	@Test
	public void shouldNotProcessWhenDifferentOfMemberShipProduct() {
		Product product = new Video();
		Order order = new Order(this.orderNumber, this.user, product);	
		SendEmail sendEmail = new SendEmail();
		
		boolean shouldProcess = sendEmail.shouldProcess(order);
		
		assertFalse(shouldProcess);
	}
	
	
	@Test
	public void shouldProcessAndNextProcessWhenPastNextProcess() {
		Product product = new MemberShip(MemberShipStatus.ACTIVATE);
		Order order = new Order(this.orderNumber, this.user, product);
		
		SendEmail sendEmail = new SendEmail();
		sendEmail.setNextProcess(this.activateMemberShip);
		sendEmail.process(order);
		
		verify(this.activateMemberShip, times(1)).process(order);
	}
	
	@Test
	public void shouldNotProcessAndShouldNextProcessWhenPastNextProcess() {
		Product product = new Video();
		Order order = new Order(this.orderNumber, this.user, product);
		
		SendEmail sendEmail = new SendEmail();
		sendEmail.setNextProcess(this.activateMemberShip);
		sendEmail.process(order);
		
		verify(this.activateMemberShip, times(1)).process(order);
	}
	
}
