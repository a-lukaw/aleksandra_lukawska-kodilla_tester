package comm;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1500, 2020);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice(); notebook.checkWeight(); notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(1200, 1000, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + notebook.year);
        heavyNotebook.checkPrice(); heavyNotebook.checkWeight(); notebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(2000, 500, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + notebook.year);
        oldNotebook.checkPrice(); oldNotebook.checkWeight(); notebook.checkYearAndPrice();
    }
}