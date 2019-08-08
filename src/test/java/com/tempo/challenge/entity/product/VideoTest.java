package com.tempo.challenge.entity.product;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tempo.challenge.entity.product.Video;



public class VideoTest {
	
	private final String LEARN_TO_SKI = "LEARN TO SKI";
	
	private Video video;
	
	@Before
    public void setUp() {
        this.video = new Video();
    }
	
	@Test
	public void shouldReturnTrueToFirstAid() {
		this.video.setTitle(this.LEARN_TO_SKI);
		assertTrue(this.video.hasFirstAid());
	}
	
}
