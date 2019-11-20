package br.com.fatecjobs.fatecjobsbackend.repository;

import br.com.fatecjobs.fatecjobsbackend.model.Aluno;
import br.com.fatecjobs.fatecjobsbackend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    @Query(value = "SELECT a FROM Aluno a WHERE a.usuario.nome LIKE %:chave% AND a.usuario.ativo = 1")
    Optional<List<Aluno>> pesquisar(@Param("chave") String chave);

    Optional<Aluno> findByUsuario(Usuario usuario);
}
