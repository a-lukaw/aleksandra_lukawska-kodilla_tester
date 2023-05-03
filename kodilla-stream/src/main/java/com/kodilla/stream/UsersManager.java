//6.1. Stream
//klasa UsersManager służy do uruchomienia (metoda main) Streamu na kolekcji użytkowników

package com.kodilla.stream;

public class UsersManager {

     public static void main(String[] args) {
         processUsersStream();
     }

     //W linii [24] wywołujemy metodę, która zwraca nam ArrayList obiektów typu User.
     //W linii [21] uruchamiamy strumień (IntelliJ podpowiada po prawej stronie, że wynikiem działania tej linii jest Stream, przez który przepływają obiekty typu User).

     //Linia [22] to operacja transformująca. Metoda map klasy Stream pozwala nam modyfikować obiekty przepływające przez strumień.
     //Podajemy referencję do metody getUserName() Referencja = NazwaKlasy::nazwaMetody

     //Linia [23] to wyrażenie terminalne (kolektor). Metoda forEach klasy Stream jest kolektorem, który wykonuje daną operację na każdym obiekcie, przepływającym kolejno przez strumień.
     // Kolektor "konsumuje" obiekty ze strumienia, nie przekazując ich już dalej, i kończy Stream.
     // Operacja, która ma być wykonana na obiektach ze strumienia, podawana jest jako wyrażenie lambda, czyli funkcja.
     // Na wejściu (z lewej strony strzałki) otrzymuje ona String z nazwą użytkownika (użyliśmy tu zmiennej o nazwie username), a w swym wnętrzu wywołuje System.out.println na tej zmiennej (z prawej strony strzałki), co powoduje wyświetlenie obiektów na ekranie.

    public static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}