package br.com.phrase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.phrase.entity.PhraseEntity;
import br.com.phrase.repository.PhraseRepository;
import br.com.phrase.util.Runtime;

@Service
public class PhraseService {

    @Autowired
    private PhraseRepository phraseRepository;

    public PhraseEntity add(PhraseEntity entity) {
        entity.setUpdated(Runtime.currentData());
        return phraseRepository.save(entity);
    }

    public PhraseEntity update(PhraseEntity entity) {
        entity.setCount(0);
        entity.setUpdated("");
        return phraseRepository.save(entity);
    }

    public PhraseEntity findAndUpdateNext(Integer stage) {

        PhraseEntity entity = phraseRepository.findNext(stage);
        entity.setCount(entity.getCount() + 1);
        entity.setUpdated(Runtime.currentData());
        return phraseRepository.save(entity);
    }

    public void deleteById(Integer id) {
        phraseRepository.delete(findById(id));
    }

    public PhraseEntity findById(Integer id) {
        return phraseRepository.findById(id).get();
    }

    public Iterable<?> findAll() {
        return phraseRepository.findAll();
    }

}