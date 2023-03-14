package com;

public class GradesMain {
    public static void main(String[] args) {
        Grades g = new Grades();
        g.add(5);
        g.add(2);
        int sum = g.sumGrades();
        System.out.println(sum);
    }
}
