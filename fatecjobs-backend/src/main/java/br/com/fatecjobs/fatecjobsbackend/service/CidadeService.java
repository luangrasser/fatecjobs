package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.model.Cidade;
import br.com.fatecjobs.fatecjobsbackend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade findByNome(String cidade) {
        Optional<Cidade> cidadeOpt = cidadeRepository.findByNome(cidade);
        return cidadeOpt.orElse(null);
    }

}
