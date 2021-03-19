package br.com.phrase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* Documentação da classe
 */
@SpringBootApplication
public class PhraseApplication {

    /**
     * Documentação do método
     */
    public static void main(String[] args) {

        SpringApplication.run(PhraseApplication.class, args);
        System.out.println("A aplicação acabou de ser inicializada!");
    }

}