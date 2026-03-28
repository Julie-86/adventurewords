package com.example.adventurewords.dto;

import jakarta.validation.constraints.NotBlank;

public class WordRequest {

    @NotBlank(message = "Word cannot be empty")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
