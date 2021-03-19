package br.com.phrase.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.phrase.entity.*;

@Repository
public interface PhraseRepository extends JpaRepository<PhraseEntity, Integer> {
        
    @Query(value = "select p.id, p.phrase1, p.phrase2, p.updated, p.count, p.stage from phrase p where p.id = (select p1.id from phrase p1 where p1.stage = ?1 order by p1.updated, p1.count limit 1)", nativeQuery = true)
    PhraseEntity findNext(Integer stage);

}
