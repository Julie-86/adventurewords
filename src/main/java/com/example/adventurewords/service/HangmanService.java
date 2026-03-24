package com.example.adventurewords.service;

import org.springframework.stereotype.Service;
import java.util.Random;

import java.util.List;
import com.example.adventurewords.model.Word;

@Service
public class HangmanService {

    private String[] words = { "adventure", "mountain", "journey", "discovery", "treasure" };
    private String chosenWord;
    private char[] guessedLetters;
    private int triesRemaining;
    private WordService wordService;

    public HangmanService(WordService wordService) {
        this.wordService = wordService;
        reset();
    }

    public void reset() {
        Random rand = new Random();
        List<Word> words = wordService.getAllWords();

        if (words.isEmpty()) {
            chosenWord = "default"; // fallback
        } else {
            Word randomWord = words.get(rand.nextInt(words.size()));
            chosenWord = randomWord.getText();
        }
        guessedLetters = new char[chosenWord.length()];
        triesRemaining = 5;
    }

    public boolean guess(char c) {
        boolean found = false;
        for (int i = 0; i < chosenWord.length(); i++) {
            if (chosenWord.charAt(i) == c) {
                guessedLetters[i] = c;
                found = true;
            }
        }
        if (!found)
            triesRemaining--;
        return found;
    }

    public String getWordState() {
        StringBuilder sb = new StringBuilder();
        for (char c : guessedLetters)
            sb.append(c == 0 ? "_" : c).append(" ");
        return sb.toString();
    }

    public int getTriesRemaining() {
        return triesRemaining;
    }

    public boolean isWon() {
        return getWordState().replace(" ", "").equals(chosenWord);
    }

    public boolean isGameOver() {
        return triesRemaining <= 0 || isWon();
    }

    public String getFullWord() {
        return chosenWord;
    }
}
