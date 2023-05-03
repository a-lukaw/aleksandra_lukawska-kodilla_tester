package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.stream.UsersRepository.getUsersList;

public class UsersManagerFilterChemists {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {

        //wywołujemy metodę, która zwraca nam ArrayList obiektów typu User

        List<String> usernames = UsersRepository.getUsersList()

                // uruchamiamy strumień (IntelliJ podpowiada po prawej stronie, że wynikiem działania tej linii jest Stream, przez który przepływają obiekty typu User)

                .stream()

                // metoda filter. Jako argument przekazujemy do tej metody wyrażenie lambda, które zwraca true lub false (informację, czy dany obiekt ma zostać przepuszczony dalej w strumieniu, czy też nie).
                // W naszym przykładzie przepuszczamy dalej w strumieniu jedynie te obiekty klasy User, dla których spełniony jest warunek getGroup().equals("Chemists").

                .filter(user -> user.getGroup().equals("Chemists"))

                // pierwsza operacja transformująca; metoda map klasy Stream pozwala nam modyfikować obiekty przepływające przez strumień.
                // Argumentem tej metody jest tzw. wyrażenie lambda, które jest "funkcją", przez którą "przepuszczamy" obiekty.
                // Po lewej stronie strzałki znajdują się zmienne reprezentujące argumenty wejściowe funkcji (tu mamy zmienną user, do której będą wpadały kolejne obiekty klasy User)
                // Po prawej stronie znajduje się kod zwracający obiekty wynikowe (tu mamy wywołanie gettera getUsername().
                // Wynikiem działania tej funkcji będą obiekty typu String zawierające nazwę użytkownika
                // IntelliJ ponownie nam podpowiada, że wynikiem tej linii będzie strumień Stream obiektów typu String.

                .map(UsersManagerFilterChemists::getUsername)


                //wyrażenie terminalne (kolektor)
                // Metoda forEach klasy Stream jest kolektorem, który wykonuje daną operację na każdym obiekcie, przepływającym kolejno przez strumień.
                // Kolektor "konsumuje" obiekty ze strumienia, nie przekazując ich już dalej oraz kończy Stream.
                // Operacja, która ma być wykonana na obiektach ze strumienia, ponownie podawana jest jako wyrażenie lambda, czyli funkcja.
                // Na wejściu (z lewej strony strzałki) otrzymuje ona String z nazwą użytkownika (użyliśmy tu zmiennej o nazwie username), a w swym wnętrzu wywołuje System.out.println na tej zmiennej
                // (z prawej strony strzałki), co powoduje wyświetlenie obiektów na ekranie.

                .collect(Collectors.toList());

                return usernames;
    }

    //metoda statyczna getUsername(), która zwraca nazwę użytkownika podanego jako argument
    public static String getUsername(User user) {
        return user.getUsername();
    }
}