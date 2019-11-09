package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Questao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Teste teste;

    @NotBlank
    private String enunciado;

    private List<String> alternativas;

    private String respostaCorreta;

    private String respostaDissertativa;

    private boolean dissertativa;

    private boolean correta;
}
