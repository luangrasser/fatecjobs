package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.form.AlunoForm;
import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.model.Competencia;
import br.com.fatecjobs.fatecjobsbackend.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompetenciaService {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    public List<Competencia> criarListaCompetencias(AlunoForm form, Aluno aluno) {
        List<Competencia> competencias = new ArrayList<>();
        if (!form.getCompetencias().isEmpty()) {
            form.getCompetencias().forEach((key, value) -> {
                Competencia competencia = Competencia.builder()
                        .descricao(key)
                        .nivel(value)
                        .aluno(aluno)
                        .build();
                competencias.add(competenciaRepository.save(competencia));
            });
        }
        return competencias;
    }
}
