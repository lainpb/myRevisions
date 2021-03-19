package br.com.phrase.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PHRASE")
public class PhraseEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true, name = "ID")    
    private Integer id;

    @Column(nullable = false, unique = true, name = "PHRASE1")    
    private String phrase1;

    @Column(nullable = false, unique = true, name = "PHRASE2")    
    private String phrase2;

    @Column(nullable = false, name = "UPDATED")    
    private String updated;
    
    @Column(nullable = false, name = "COUNT")    
    private Integer count;    

    @Column(nullable = false, name = "STAGE")    
    private Integer stage;        
}