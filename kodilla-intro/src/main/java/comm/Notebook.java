package comm;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is lightweight.");
        } else if (this.weight > 600 && this.weight <= 1200) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year <= 2010 && this.price <= 500) {
            System.out.println("This laptop is old and cheap.");
        } else if (this.year > 2015 && this.year < 2020 && this.price > 500 && this.price <= 1500) {
            System.out.println("This laptop is quite old and quite expensive.");
        } else {
            System.out.println("This laptop is quite new and expensive.");
        }
    }
}
