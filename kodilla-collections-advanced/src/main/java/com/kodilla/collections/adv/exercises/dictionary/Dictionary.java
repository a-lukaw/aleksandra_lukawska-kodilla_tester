package com.kodilla.collections.adv.exercises.dictionary;                                  //5.4. Testy z użyciem kolekcji

import java.util.*;
//5.4. Przykład testów z użyciem kolekcji

public class Dictionary {                                                                   //Klasa ta będzie przechowywała wpisy słownika w mapie: Map<String, List<EnglishWord>>

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List <EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();

        for(EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech));
            result.add(englishWord);
        }
        return result;
        }

    public List <EnglishWord> findEnglishWord(String polishWord, String partOfSpeech) {
        return Collections.emptyList();
    }
    public int size() {
        return dictionary.size();
    }
}