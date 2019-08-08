package com.tempo.challenge.entity.user;

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
public class MemberShip {
	
	private Status status;
	
	private Level level;
	
	public boolean isActivated() {
		return Status.ACTIVATED.equals(this.status);
	}
	
	public boolean isFullLevel() {
		return Level.FULL.equals(this.level);
	}
	
}
