package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.form.AlunoForm;
import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.model.FaculdadeAluno;
import br.com.fatecjobs.fatecjobsbackend.repository.FaculdadeAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaculdadeAlunoService {

    @Autowired
    private FaculdadeAlunoRepository faculdadeAlunoRepository;
    @Autowired
    private FaculdadeService faculdadeService;

    public void criarFaculdadeAluno(AlunoForm form, Aluno aluno) {
        FaculdadeAluno faculdadeAluno = FaculdadeAluno.builder()
                .aluno(aluno)
                .faculdade(faculdadeService.findByNome(form.getFaculdade()))
                .curso(form.getCurso())
                .concluida(form.getConcluida().equals("Sim"))
                .dataConclusao(form.getDataConclusao())
                .build();
        faculdadeAlunoRepository.save(faculdadeAluno);
    }

}
