package br.com.fatecjobs.fatecjobsbackend.dto;

import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

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

    public static List<AlunoDto> convertList(List<Aluno> alunos) {
        return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
    }

}
