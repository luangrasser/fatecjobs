package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.exception.UserFriendlyException;
import br.com.fatecjobs.fatecjobsbackend.form.AlunoForm;
import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.model.Usuario;
import br.com.fatecjobs.fatecjobsbackend.repository.AlunoRepository;
import br.com.fatecjobs.fatecjobsbackend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CompetenciaService competenciaService;
    @Autowired
    private FaculdadeAlunoService faculdadeAlunoService;

    @Transactional
    public Aluno salvar(AlunoForm form) {
        Aluno aluno = form.convert();
        aluno.setUsuario(usuarioService.criarUsuario(form));
        Aluno alunoSalvo = alunoRepository.save(aluno);
        faculdadeAlunoService.criarFaculdadeAluno(form, alunoSalvo);
        return alunoSalvo;
    }

    public List<Aluno> pesquisar(String chave) {
        return alunoRepository.findByUsuarioNomeContaining(chave).orElse(null);
    }

    @Transactional
    public Aluno atualizar(Integer id, AlunoForm form) throws UserFriendlyException {
        Aluno aluno = findAlunoById(id);
        aluno.setUsuario(usuarioService.atualizar(aluno.getUsuario(),form));
        return aluno;
    }

    @Transactional
    public void excluir(Integer id) throws UserFriendlyException {
        Aluno aluno = findAlunoById(id);
        Usuario usuario = aluno.getUsuario();
        alunoRepository.delete(aluno);
        usuarioRepository.delete(usuario);
    }

    private Aluno findAlunoById(Integer id) throws UserFriendlyException {
        Optional<Aluno> alunoOpt = alunoRepository.findById(id);
        if (!alunoOpt.isPresent()) {
            throw new UserFriendlyException("Aluno não encontrado.");
        }
        return alunoOpt.get();
    }
}
