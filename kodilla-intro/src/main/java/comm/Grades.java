package comm;

//Zad. 2.3. utwórz klasę Grades, która będzie przechowywać 10 ocen ucznia. Klasa powinna zawierać 3 metody:
//dodającą przekazaną w argumencie ocenę do tablicy,
//zwracającą ostatnio dodaną ocenę,
//zwracającą średnią ocen.

public class Grades {
    private int[] grades;
    private int lastIndex;

    public Grades() {                                                                           //wywołujemy kontruktor
        this.grades = new int[10];                                                             //przypisujemy nową wartość do zmiennej, przechowującej oceny//
        lastIndex = -1;
    }

    //metoda dodająca przekazaną w argumencie ocenę do tablicy
    public void addGrade(int grade) {
        if (lastIndex < 9) {
            lastIndex++;
            grades[lastIndex] = grade;
        }
    }

    //metoda sumująca oceny z tablicy
    int sumGrades() {
        int sumGrades = 0;
        for (int i = 0; this.grades.length > i; i++) {
            sumGrades = sumGrades + this.grades[i];
        }
        return sumGrades;
    }

    //metoda zwracająca ostatnio dodaną ocenę
    public int getLastAddedGrade() {
        if (lastIndex >= 0) {
            return grades[lastIndex];
        } else {
            return -1;
        }
    }

    // metoda zwracająca średnią ocen
    public double calculateAverage() {
        if (lastIndex >= 0) {
            int sum = 0;
            for (int i = 0; i <= lastIndex; i++) {
                sum += grades[i];
            }
            return (double) sum / (lastIndex + 1);
        } else {
            return 0.0;                                                       // Specjalna wartość, wskazująca brak ocen
        }
    }
}