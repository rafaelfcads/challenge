package com.tempo.challenge.entity.product;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tempo.challenge.entity.product.MemberShip;
import com.tempo.challenge.entity.product.MemberShipStatus;



public class MemberShipTest {
	
	private MemberShip memberShip;
	
	@Before
    public void setUp() {
        this.memberShip = new MemberShip();
    }
	
	@Test
	public void shouldReturnTrueToMemberShipStatusActivate() {
		this.memberShip.setStatus(MemberShipStatus.ACTIVATE);
		assertTrue(this.memberShip.isActivate());
	}
	
	@Test
	public void shouldReturnTrueToMemberShipStatusUpgrade() {
		this.memberShip.setStatus(MemberShipStatus.UPGRADE);
		assertTrue(this.memberShip.isUpgrade());
	}
	
}
