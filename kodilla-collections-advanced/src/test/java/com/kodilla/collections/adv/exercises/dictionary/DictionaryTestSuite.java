package com.kodilla.collections.adv.exercises.dictionary;
//5.4. Przykład testów z użyciem kolekcji

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

//test dodaje do słownika jeden wpis, a następnie przy pomocy asercji sprawdza, czy słownik zawiera dokładnie jeden wpis

class DictionaryTestSuite {
    @Test
    public void testAddEnglishWord() {
    //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");

        //when
        dictionary.addWord(polishWord, new EnglishWord(PartOfSpeech.NOUN, "stack"));

        //then
        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindEnglishWOrds() {
        //given
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.NOUN, "play"));

        //when
        List<EnglishWord> result = dictionary.findEnglishWords("gra", PartOfSpeech.NOUN);

        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindingWords_withPartOfSpeech() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));

        //when - w tej sekcji z reguły znajduje się tylko jedna linia – jest to wywołanie metody, którą testuje nasz test

        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);

        //then - sekcja poświęcona sprawdzeniu, czy testowana klasa zachowała się poprawnie – tutaj zamieszczamy wszystkie asercje

        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));                           //sprawdzenie, czy zwrócone elementy są poprawne

        assertEquals(expectedList, result);                                                                 //sprawdzenie przy pomocy asercji, czy testowana metoda zwróciła prawidłową liczbę elementów
    }
}
