package comm;

import java.util.Random;

public class RandomNumbers {
    int sum;
    int min;
    int max;

    public RandomNumbers() {
        this.sum = 0;
        this.min = 31;
        this.max = 0;
    }

    public int getCountOfRandomNumbers() {

        //utworzenie obiektu typu Random

        Random random = new Random();
        int temp;
        while (this.sum < 5000) {
            temp = random.nextInt(31);
            sum = sum + temp;
            if (this.min > temp) {
                min = temp;
            }
            if (this.max < temp) {
                max = temp;
            }
        }
    return sum;
    }
    public int getMin() {
        return this.min;
    }
    public int getMax() {
        return this.max;
    }
}
