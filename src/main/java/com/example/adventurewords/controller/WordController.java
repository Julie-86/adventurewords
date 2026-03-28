package com.example.adventurewords.controller;

import com.example.adventurewords.model.Word;
import com.example.adventurewords.service.WordService;
import com.example.adventurewords.dto.WordRequest;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

/**
 * REST Controller for managing Word resources.
 *
 * Exposes endpoints for:
 * - creating words
 * - retrieving words
 */
@RestController
@RequestMapping("/api/words")
public class WordController {

    private final WordService wordService;

    /**
     * Constructor-based dependency injection.
     */
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    /**
     * GET endpoint to retrieve all words.
     *
     * @return list of words from database
     */
    @GetMapping
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }

    /**
     * POST endpoint to create a new word.
     *
     * @param text the word text (from request body)
     * @return the saved Word entity
     */
     @PostMapping
     public Word createWord(@Valid @RequestBody WordRequest request) {
         return wordService.saveWord(request.getText());
     }
}
