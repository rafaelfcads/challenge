package com.tempo.challenge.entity.user;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tempo.challenge.entity.user.Level;
import com.tempo.challenge.entity.user.MemberShip;
import com.tempo.challenge.entity.user.Status;



public class MemberShipTest {
	
	private MemberShip memberShip;
	
	@Before
    public void setUp() {
        this.memberShip = new MemberShip(Status.ACTIVATED, Level.FULL);
    }
	
	@Test
	public void shouldReturnUserMemberShipAsActivated() {
		assertTrue(this.memberShip.isActivated());
	}
	
	@Test
	public void shouldReturnUserMemberShipAsFull() {
		assertTrue(this.memberShip.isFullLevel());
	}
	
}
