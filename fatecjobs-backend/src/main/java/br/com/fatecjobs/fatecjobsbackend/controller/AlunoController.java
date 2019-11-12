package br.com.fatecjobs.fatecjobsbackend.controller;

import br.com.fatecjobs.fatecjobsbackend.form.AlunoForm;
import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/salvar")
    @Transactional
    public ResponseEntity<Aluno> salvar(@RequestBody @Valid AlunoForm form, UriComponentsBuilder uriBuilder) {
        try {
            Aluno aluno = alunoService.salvar(form);
            URI uri = uriBuilder.path("/aluno/{id}").buildAndExpand(aluno.getId()).toUri();
            return ResponseEntity.created(uri).body(aluno);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
