package com.kodilla.abstracts.homework;

public class PetroleumGeologist extends Job {
    public PetroleumGeologist() {
        super(10000, "searching for hydrocarbons");
    }

    @Override
    public String showResponsibilities() {
        return ("searching for hydrocarbons");
    }
}
