package hu.progmatic.gallowswithdb_0928.controller;

import hu.progmatic.gallowswithdb_0928.model.Word;
import hu.progmatic.gallowswithdb_0928.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }


}
