package com.tempo.challenge.entity.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberShip extends Product {
	
	private MemberShipStatus status;
	
	public boolean isActivate() {
		return MemberShipStatus.ACTIVATE.equals(this.status);
	}
	
	public boolean isUpgrade() {
		return MemberShipStatus.UPGRADE.equals(this.status);
	}
	
}
