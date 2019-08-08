package com.tempo.challenge.entity.product;

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
public abstract class Product {

	private String title;
	
	private Type type;
	
	public boolean isPhisical() {
		return Type.PHYSICAL.equals(this.type);
	}
	
}
