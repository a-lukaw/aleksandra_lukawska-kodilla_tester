package comm;

//Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30, tak długo, aż ich suma przekroczy 5000.
//Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość

import java.util.Random;

public class RandomNumbers {
    int min;                                                                            //minimalna z wylosowanych liczb
    int max;                                                                          //maksymalna z wyolosowanych liczb
    int sum;                                                                                       //suma losowych liczb

    public RandomNumbers() {
        this.min = 0;
        this.max = 31;
        this.sum = 0;
    }

    public void getCountOfRandomNumbers() {

        Random random = new Random();                                                   //utworzenie obiektu typu random

        int temp;                                                                  //utworzenie zmiennej temp, która będzie przechowywać tymczasową sumę liczb

        while (this.sum < 5000) {
            temp = random.nextInt(31);
            this.sum += temp;

            if (this.min > temp) {
                this.min = temp;
            }
            if (this.max < temp) {
                this.max = temp;
            }
        }
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }
}
