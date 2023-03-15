package comm;

public class Book {

    //tworzymy pola klasy
    private String author;

    private String title;

    //tworzymy konstruktor [Alt + insert]
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    /*metoda statyczna of, któa jako parametr przyjmuje autora i tytuł książki
    metoda ta ma zwracać utworzony obiekt książki*/
    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    //przykładowa baza danych, z której wyżej wyciągamy interesujące nas dane
    public static void main(String[] args) {
        Book book  = Book.of("Isaac Asimov", "The Galaxy");
        Book bookX = new Book("Isaac Asimov", "The Galaxy");
        Book book1 = Book.of("Isaac Asimov", "The Galaxy");
        Book book2 = Book.of("Isaac Asimov", "The Galaxy");
        Book book3 = Book.of("Isaac Asimov", "The Galaxy");
        Book book4 = Book.of("ala ma kota", "kodilla");
    }
}
