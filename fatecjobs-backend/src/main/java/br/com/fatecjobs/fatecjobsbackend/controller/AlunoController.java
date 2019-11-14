package br.com.fatecjobs.fatecjobsbackend.controller;

import br.com.fatecjobs.fatecjobsbackend.dto.AlunoDto;
import br.com.fatecjobs.fatecjobsbackend.exception.UserFriendlyException;
import br.com.fatecjobs.fatecjobsbackend.form.AlunoForm;
import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/salvar")
    public ResponseEntity<AlunoDto> salvar(@RequestBody @Valid AlunoForm form, UriComponentsBuilder uriBuilder) {
        try {
            Aluno aluno = alunoService.salvar(form);
            URI uri = uriBuilder.path("/alunos/{id}").buildAndExpand(aluno.getId()).toUri();
            return ResponseEntity.created(uri).body(new AlunoDto(aluno));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/pesquisar")
    public ResponseEntity<List<AlunoDto>> pesquisar(@RequestParam String chave) {
        try {
            return ResponseEntity.ok(AlunoDto.convertList(alunoService.pesquisar(chave)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<AlunoDto> atualizar(@PathVariable Integer id, @RequestBody @Valid AlunoForm form) {
        try {
            return ResponseEntity.ok(new AlunoDto(alunoService.atualizar(id, form)));
        } catch (UserFriendlyException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<?> excluir(@PathVariable Integer id) {
        try {
            alunoService.excluir(id);
            return ResponseEntity.ok().build();
        } catch (UserFriendlyException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
