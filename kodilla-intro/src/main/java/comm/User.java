package comm;

public class User {
    //nadajemy klasie atrybuty (zmienne)//
    String userName;
    int userAge;

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    /*tworzymy obiekty, którymi chcemy wypełnić tablicę
    każdy obiekt ma dwie właściwości: imię oraz wiek*/

    public static void main(String[] args) {
        User ola = new User("Ola", 34);
        User ania = new User("Ania", 28);
        User marta = new User("Marta", 35);
        User ewelcia = new User("Ewelcia", 34);
        User arkadiusz = new User("Arkadiusz", 43);
        User hubert = new User("Hubert", 45);
        User michal = new User("Michal", 35);
        User felek = new User("Felek", 2);
        User ewa = new User("Ewa", 68);
        User wojciech = new User("Wojciech", 70);

        //tworzymy tablicę o nazwie User i wypełniamy ją obiektami stworzonymi powyżej//
        User[] users = {ola, ania, marta, ewelcia, arkadiusz, hubert, michal, felek, ewa, wojciech};

        //za pomocą pętli for wyciągamy z każdego obiektu typu User wartość pola, w którym zapisany jest wiek//

        double sumAge = 0;
        for (int i = 0; users.length > i; i++) {
            sumAge = sumAge + users[i].userAge;
        }
        double avgAge = sumAge / users.length;

        for (int i = 0; users.length > i; i++) {
            int Age = users[i].userAge;

            //wyświetlenie użytkowników, których wiek < średnia//
            if(Age < avgAge) {
                System.out.println(users[i].userName);
            }
        }
    }
}