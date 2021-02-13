package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortuneArray = {"Good day", "Bad day", "Don't step out"};
	@Override
	public String getFortune() {
		Random rand = new Random();
		int fortune_idx = rand.nextInt(fortuneArray.length);
		return fortuneArray[fortune_idx];
	}

}
