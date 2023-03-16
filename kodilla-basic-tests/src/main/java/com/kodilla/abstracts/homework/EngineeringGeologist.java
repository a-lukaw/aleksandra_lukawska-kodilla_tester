package com.kodilla.abstracts.homework;

public class EngineeringGeologist extends Job {
    public EngineeringGeologist() {
        super(500, "infrastructure");
    }

    @Override
    public String showResponsibilities() {
        return ("infrastructure");
    }
}
