package comm;
public class GenerateNumber {
    public static void main(String[] args) {
        RandomNumbers generator = new RandomNumbers();                   //Tworzy obiekt klasy RandomNumbers o nazwie generator przy użyciu konstruktora bezparametrowego, pozwala na korzystanie z metod i właściwości zdefiniowanych w klasie RandomNumbers

        generator.getCountOfRandomNumbers();                              //Wywołuje metodę generateRandomNumbers() na obiekcie generator

        int minValue = generator.getMin();                                //Wywołuje metodę getMin() na obiekcie generator, aby uzyskać minimalną wylosowaną wartość, a następnie przypisuje ją do zmiennej minValue
        int maxValue = generator.getMax();

        System.out.println(minValue);
        System.out.println(maxValue);
    }
}