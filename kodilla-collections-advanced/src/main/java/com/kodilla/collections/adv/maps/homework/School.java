package com.kodilla.collections.adv.maps.homework;

//Zad. 5.2. Szkoły i dyrektorzy

import java.util.ArrayList;
import java.util.List;

public class School {
    String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", numberOfPupilsInClass=" + numberOfPupilsInClass +
                '}';
    }

    List<Integer> numberOfPupilsInClass = new ArrayList<>();

    public void addClass(int numberOfStudents) {
        numberOfPupilsInClass.add(numberOfStudents);
    }

    public List<Integer> getClasses() {
        return numberOfPupilsInClass;
    }
}
