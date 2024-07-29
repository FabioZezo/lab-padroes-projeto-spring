package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;

public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Endereco> buscarTodos() {

        return enderecoRepository.findAll();
    }
}
