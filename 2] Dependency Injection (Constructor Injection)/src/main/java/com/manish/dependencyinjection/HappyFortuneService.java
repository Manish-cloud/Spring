package com.manish.dependencyinjection;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is lucky Day !";
    }
}
