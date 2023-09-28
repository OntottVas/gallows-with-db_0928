package hu.progmatic.gallowswithdb_0928.repository;

import hu.progmatic.gallowswithdb_0928.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, String> {

}
