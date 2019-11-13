package br.com.fatecjobs.fatecjobsbackend.dto;

import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.HashMap;

@Getter
public class AlunoDto {

    public AlunoDto(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.tipoUsuario = aluno.getTipoUsuario();
        this.cidade = aluno.getNomeCidade();
    }

    private Integer id;

    private String nome;

    private String email;

    private String tipoUsuario;

    private String cidade;

}
