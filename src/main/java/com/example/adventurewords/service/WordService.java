package com.example.adventurewords.service;

import com.example.adventurewords.model.Word;
import com.example.adventurewords.repository.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer responsible for business logic related to Word entity.
 *
 * It acts as an intermediary between the Controller and the Repository.
 */
@Service
public class WordService {

    private final WordRepository wordRepository;

    /**
     * Constructor-based dependency injection (recommended in modern Spring).
     *
     * @param wordRepository repository used to access database
     */
    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    /**
     * Saves a new Word into the database.
     *
     * @param text the word text
     * @return the saved Word entity
     */
    public Word saveWord(String text) {
        Word word = new Word(text);
        return wordRepository.save(word);
    }

    /**
     * Retrieves all words from the database.
     *
     * @return list of words
     */
    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }
}
