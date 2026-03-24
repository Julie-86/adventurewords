package com.example.adventurewords.model;

import jakarta.persistence.*;

/**
 * Entity class that represents a Word in the system.
 * This class is mapped to a database table using JPA.
 */
@Entity
public class Word {

    /**
     * Unique identifier for each Word.
     * Generated automatically by the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The text value of the word.
     */
    private String text;

    /**
     * Default constructor required by JPA.
     */
    public Word() {}

    /**
     * Constructor used to create a Word instance with a given text.
     *
     * @param text the word value
     */
    public Word(String text) {
        this.text = text;
    }

    /**
     * Returns the unique identifier of the word.
     *
     * @return the id of the word
     */
    public Long getId() {
        return id;
    }

    /**
     * Returns the text of the word.
     *
     * @return the word text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text of the word.
     *
     * @param text the new word value
     */
    public void setText(String text) {
        this.text = text;
    }
}
