package com.tempo.challenge.entity.order;

import com.tempo.challenge.entity.product.Product;
import com.tempo.challenge.entity.user.User;

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
public class Order {
	
	private Long number;
	
	private User user;
	
	private Product product;

}
