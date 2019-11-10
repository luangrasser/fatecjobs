package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.model.TipoUsuario;
import br.com.fatecjobs.fatecjobsbackend.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    public TipoUsuario findByDescricao(String descricao) {
        Optional<TipoUsuario> tipoUsuarioOpt = tipoUsuarioRepository.findByDescricao(descricao);
        return tipoUsuarioOpt.orElse(null);
    }


}
