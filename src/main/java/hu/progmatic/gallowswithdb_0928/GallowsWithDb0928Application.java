package hu.progmatic.gallowswithdb_0928;

import hu.progmatic.gallowswithdb_0928.model.Word;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GallowsWithDb0928Application {

    public static void main(String[] args) {
        SpringApplication.run(GallowsWithDb0928Application.class, args);
    }
    Word word = new Word();
}
