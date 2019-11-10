package br.com.fatecjobs.fatecjobsbackend.repository;

import br.com.fatecjobs.fatecjobsbackend.model.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {

    Optional<TipoUsuario> findByDescricao(String descricao);
}
