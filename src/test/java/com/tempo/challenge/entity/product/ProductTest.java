package com.tempo.challenge.entity.product;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tempo.challenge.entity.product.Book;
import com.tempo.challenge.entity.product.Product;
import com.tempo.challenge.entity.product.Type;



public class ProductTest {
	
	private Product product;
	
	@Before
    public void setUp() {
        this.product = new Book();
        this.product.setType(Type.PHYSICAL);
    }
	
	@Test
	public void shouldReturnTrueToPhisical() {
		assertTrue(this.product.isPhisical());
	}
	
}
