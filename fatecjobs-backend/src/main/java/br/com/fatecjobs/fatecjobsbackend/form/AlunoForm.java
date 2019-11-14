package br.com.fatecjobs.fatecjobsbackend.form;


import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.model.DataExchangeUsuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
public class AlunoForm implements DataExchangeUsuario<Aluno> {

    //Informações do usuário

    @NotBlank(message="O nome do usuário não pode estar em branco")
    private String nome;

    @NotBlank(message="O e-mail do usuário não pode estar em branco")
    private String email;

    @NotBlank(message="A senha do usuário não pode estar em branco")
    private String senha;

    @NotBlank(message = "O tipo do usuário não pode estar em branco")
    private String tipoUsuario;

    private String cidade;

    //Informações da faculdade do aluno

    @NotBlank(message="A faculdade do usuário não pode estar em branco")
    private String faculdade;

    @NotBlank(message="O curso do usuário não pode estar em branco")
    private String curso;

    private String concluida;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dataConclusao;

    public Aluno convert() {
        return Aluno.builder().build();
    }
}
