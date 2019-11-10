package br.com.fatecjobs.fatecjobsbackend.service;

import br.com.fatecjobs.fatecjobsbackend.model.Faculdade;
import br.com.fatecjobs.fatecjobsbackend.repository.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FaculdadeService {

    @Autowired
    private FaculdadeRepository faculdadeRepository;

    public Faculdade findByNome(String faculdade) {
        Optional<Faculdade> faculdadeOpt = faculdadeRepository.findByNome(faculdade);
        return faculdadeOpt.orElse(null);
    }
}
