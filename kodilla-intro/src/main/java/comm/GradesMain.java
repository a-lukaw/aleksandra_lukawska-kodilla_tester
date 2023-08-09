package comm;

public class GradesMain {
        public static void main(String[] args) {
            Grades studentGrades = new Grades();

            studentGrades.addGrade(5);
            studentGrades.addGrade(2);
            studentGrades.addGrade(3);

            int lastAddedGrade = studentGrades.getLastAddedGrade();
            System.out.println("Ostatnio dodana ocena: " + lastAddedGrade);

            double averageGrade = studentGrades.calculateAverage();
            System.out.println("Średnia ocen wynosi: " + averageGrade);
        }
    }