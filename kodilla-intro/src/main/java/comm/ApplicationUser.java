package comm;
//Zad. 2.6. Refaktoryzacja kodu
//Poniższy kod napisany jest w sposób strukturalny. Przepisz ten kod na taki, który nada naszemu programowi cech podejścia obiektowego.

public class ApplicationUser {
    String name;
    double age;
    double height;

    public ApplicationUser(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean isOlderThan30() {
        return age > 30;
    }

    public boolean isTallerThan160() {
        return height > 160;
    }

    public void printUserStatus() {

        if (isOlderThan30() && isTallerThan160()) {
            System.out.println("User " + name + " is older than 30 and taller than 160 cm");

        } else {
            System.out.println("User " + name +  " is 30 (or younger) or 160 cm (or shorter)");
        }
    }
}