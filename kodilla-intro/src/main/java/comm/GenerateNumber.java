package comm;
public class GenerateNumber {
    public static void main(String[] args) {
        RandomNumbers generator = new RandomNumbers();
        generator.getCountOfRandomNumbers();
        int minValue = generator.getMin();
        int maxValue = generator.getMax();
        System.out.println(minValue);
        System.out.println(maxValue);
    }
}
