package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
		private FortuneService fortuneService;
		
		//Constructor dependency injection
		public BaseballCoach(FortuneService theFortuneService) {
			this.fortuneService = theFortuneService;
		}
	
		@Override
		public String getDailyWorkout() {
			return "Spend 30 minutes on batting practices";
		}

		@Override
		public String getDailyFortune() {

			return fortuneService.getFortune();
		}
}
