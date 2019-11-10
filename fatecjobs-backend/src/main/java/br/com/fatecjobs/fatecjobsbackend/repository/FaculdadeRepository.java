package br.com.fatecjobs.fatecjobsbackend.repository;

import br.com.fatecjobs.fatecjobsbackend.model.Faculdade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FaculdadeRepository extends JpaRepository<Faculdade, Integer> {

    Optional<Faculdade> findByNome(String nome);
}
