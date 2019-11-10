package br.com.fatecjobs.fatecjobsbackend.repository;

import br.com.fatecjobs.fatecjobsbackend.model.FaculdadeAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculdadeAlunoRepository  extends JpaRepository<FaculdadeAluno, Integer> {

}
