package hu.progmatic.gallowswithdb_0928.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Word {

    @Id
    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
