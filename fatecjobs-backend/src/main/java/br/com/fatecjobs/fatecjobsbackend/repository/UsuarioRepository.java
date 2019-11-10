package br.com.fatecjobs.fatecjobsbackend.repository;

import br.com.fatecjobs.fatecjobsbackend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {

}
