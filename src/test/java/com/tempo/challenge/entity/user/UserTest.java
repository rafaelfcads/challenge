package com.tempo.challenge.entity.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tempo.challenge.entity.user.Level;
import com.tempo.challenge.entity.user.MemberShip;
import com.tempo.challenge.entity.user.Status;
import com.tempo.challenge.entity.user.User;

public class UserTest {
	
	private User user;
	
	@Before
    public void setUp() {
        this.user = new User(new MemberShip());
    }
	
	@Test
	public void shouldSetUserMemberShipStatusAsActivated() {
		this.user.setMemberShipStatus(Status.ACTIVATED);
		assertEquals(Status.ACTIVATED, user.getMemberShip().getStatus());
	}
	
	@Test
	public void shouldSetUserMemberShipLevelAsFull() {
		this.user.setMemberShipLevel(Level.FULL);
		assertEquals(Level.FULL, user.getMemberShip().getLevel());
	}
	
	@Test
	public void shouldReturnUserMemberShipStatusAsActivated() {
		this.user.setMemberShipStatus(Status.ACTIVATED);
		assertTrue(user.isActivated());
	}
}
