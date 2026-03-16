package com.example.adventurewords.controller;

import com.example.adventurewords.service.HangmanService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class GameController {

    private final HangmanService game;

    public GameController(HangmanService game) {
        this.game = game;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("word", game.getWordState());
        model.addAttribute("tries", game.getTriesRemaining());
        model.addAttribute("gameOver", game.isGameOver());
        model.addAttribute("won", game.isWon());
        return "index";
    }

    @PostMapping("/guess")
    @ResponseBody
    public String guess(@RequestParam char letter) {
        game.guess(letter);
        return game.getWordState() + "|" + game.getTriesRemaining() + "|" + game.isGameOver() + "|" + game.isWon() + "|" + game.getFullWord();
    }

    // restart game
    @GetMapping("/restart")
    public String restart() {
        game.reset();
        return "redirect:/";
    }
}
