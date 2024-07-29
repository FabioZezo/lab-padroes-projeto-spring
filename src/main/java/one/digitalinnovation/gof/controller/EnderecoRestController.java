package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enderecos")
public class EnderecoRestController {

    EnderecoService enderecoService;

    public ResponseEntity<Iterable<Endereco>> buscarTodos() {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }
}
