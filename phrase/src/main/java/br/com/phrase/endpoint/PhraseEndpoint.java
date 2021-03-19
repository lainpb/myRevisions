package br.com.phrase.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phrase.entity.PhraseEntity;
import br.com.phrase.service.PhraseService;

@RestController
@RequestMapping("/phrase")
public class PhraseEndpoint {

    @Autowired
    private PhraseService phraseService;

    @PostMapping(path = "/")
    /*@ApiOperation(value = "Cadastrar")*/
    public PhraseEntity add(PhraseEntity entity) {
        return phraseService.add(entity);
    }

    @PutMapping(path = "/{id}")
    /*@ApiOperation(value = "Alterar")*/
    public PhraseEntity update(@PathVariable Integer id) {
        return phraseService.update(phraseService.findById(id));
    }

    @DeleteMapping(path = "/{id}")
    /*@ApiOperation(value = "Excluir")*/
    public void deleteById(@PathVariable Integer id) {
        phraseService.deleteById(id);
    }

    @GetMapping(path = "/{id}")
    /*@ApiOperation(value = "Consultar por id")*/
    public PhraseEntity findById(@PathVariable Integer id) {
        return phraseService.findById(id);
    }

    @GetMapping(path = "/")
    /*@ApiOperation(value = "Consultar todos")*/
    public Iterable<?> findAll() {
        return phraseService.findAll();
    }

    @PutMapping(path = "/{stage}/next")
    /*@ApiOperation(value = "Próxima")*/
    public PhraseEntity findAndUpdateNext(@PathVariable Integer stage) {
        return phraseService.findAndUpdateNext(stage);
    }
}