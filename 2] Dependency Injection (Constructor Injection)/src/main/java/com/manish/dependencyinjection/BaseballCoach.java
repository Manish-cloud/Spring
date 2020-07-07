package com.manish.dependencyinjection;

public class BaseballCoach implements Coach{

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	BaseballCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minute on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneService to get fortune
		return fortuneService.getFortune();
	}

}