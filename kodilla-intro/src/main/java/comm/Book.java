package comm;

//Zad. 2.7. zmienne i metody statyczne
//Napisz klasę Book, która będzie posiadała pola
//private String author oraz private String title
//Wyposaż tę klasę również w statyczną metodę of, która jako parametry przyjmie nazwę autora oraz tytuł. Metoda ta ma zwracać utworzony obiekt książki (będziemy jej używać zamiast konstruktora).
// Jej użycie będzie wyglądało przykładowo tak:
//Book book = Book.of("Isaac Asimov", "The Galaxy");


public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    private static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.getAuthor() + " " + book.getTitle());
    }
}
