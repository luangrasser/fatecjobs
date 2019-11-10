package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.model.DataExchangeUsuario;
import br.com.fatecjobs.fatecjobsbackend.model.Usuario;
import br.com.fatecjobs.fatecjobsbackend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private CidadeService cidadeService;
    @Autowired
    private TipoUsuarioService tipoUsuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(DataExchangeUsuario form) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        Usuario usuario = Usuario.builder()
                .nome(form.getNome())
                .email(form.getEmail())
                .senha(encoder.encode(form.getSenha()))
                .tipoUsuario(tipoUsuarioService.findByDescricao(form.getTipoUsuario()))
                .cidade(cidadeService.findByNome(form.getCidade()))
                .build();
        return usuarioRepository.save(usuario);
    }
}
