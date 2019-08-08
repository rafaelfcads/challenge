package com.tempo.challenge.entity.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Video extends Product {
	
	private final String LEARN_TO_SKI = "LEARN TO SKI";

	public boolean hasFirstAid() {
		return this.LEARN_TO_SKI.equals(this.getTitle());
	}
}
