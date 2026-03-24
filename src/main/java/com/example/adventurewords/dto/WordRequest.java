package com.example.adventurewords.dto;

/**
 * DTO for creating a Word.
 */
public class WordRequest {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
