package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.form.AlunoForm;
import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.model.Cidade;
import br.com.fatecjobs.fatecjobsbackend.model.TipoUsuario;
import br.com.fatecjobs.fatecjobsbackend.model.Usuario;
import br.com.fatecjobs.fatecjobsbackend.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private CompetenciaService competenciaService;
    @Autowired
    private FaculdadeAlunoService faculdadeAlunoService;

    public Aluno salvar(AlunoForm form) {
        Aluno aluno = form.convert();
        aluno.setUsuario(usuarioService.criarUsuario(form));
        aluno.setCompetencias(competenciaService.criarListaCompetencias(form, aluno.getUsuario()));
        Aluno alunoSalvo = alunoRepository.save(aluno);
        faculdadeAlunoService.criarFaculdadeAluno(form, alunoSalvo);
        return alunoSalvo;
    }



}
