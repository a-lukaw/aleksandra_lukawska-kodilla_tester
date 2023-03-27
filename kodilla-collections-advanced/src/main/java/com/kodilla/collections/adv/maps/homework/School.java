package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classes = new ArrayList<>();

    public School(String name) {
        this.name = name;    }

    public void addClass(int numberOfStudents) {
        classes.add(numberOfStudents);    }

    public String getName() {
        return name;    }

    public List<Integer> getClasses() {
        return classes;    }
}