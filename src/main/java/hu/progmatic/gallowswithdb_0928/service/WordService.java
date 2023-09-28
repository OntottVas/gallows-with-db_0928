package hu.progmatic.gallowswithdb_0928.service;

import hu.progmatic.gallowswithdb_0928.model.Word;
import hu.progmatic.gallowswithdb_0928.repository.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {
    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }
}
