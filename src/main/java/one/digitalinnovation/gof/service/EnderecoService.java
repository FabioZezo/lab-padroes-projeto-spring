package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.stereotype.Service;

@Service
public interface  EnderecoService {
    Iterable<Endereco> buscarTodos();


}
