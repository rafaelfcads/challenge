package com.tempo.challenge.entity.user;

import com.tempo.challenge.entity.user.MemberShip;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private MemberShip memberShip;
	
	public MemberShip getMemberShip() {
		if (this.memberShip == null) {
			this.memberShip = new MemberShip();
		}
		return this.memberShip;
	}
	
	public void setMemberShipStatus(Status status) {
		this.getMemberShip().setStatus(status);
	}
	
	public void setMemberShipLevel(Level level) {
		this.getMemberShip().setLevel(level);
	}
	
	public boolean isActivated() {
		return this.getMemberShip().isActivated();
	}
	
}
