package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.controller;

import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service.GestaoTransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class GestaoTransacoesController {

    @Autowired
    GestaoTransacoesService gestaoTransacoesService;

    @PostMapping("/transacoes")
    public Mono<GestaoTransacoes> save(@RequestBody GestaoTransacoes GestaoTransacoes) {
        return gestaoTransacoesService.addTransacoes(GestaoTransacoes);
    }

    @PutMapping("/{id}/atualizarProtocoloFraudes")
    public ResponseEntity updateProtocoloFraudes(@PathVariable(value = "id") String id, @RequestBody GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException {
        return new ResponseEntity(gestaoTransacoesService.atualizarProtocoloFraudes(id, pGestaoTransacoes), HttpStatus.OK);
    }

    @PutMapping("/{id}/atualizarStatusFraudes")
    public ResponseEntity updateStatusFraudes(@PathVariable(value = "id") String id, @RequestBody GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException {
        return new ResponseEntity(gestaoTransacoesService.atualizarStatusFraudes(id, pGestaoTransacoes), HttpStatus.OK);
    }

    @GetMapping("/consultaStatusFraudes/{idTransacao}")
    public Mono<GestaoTransacoes> getById(@PathVariable String idTransacao) {
        Mono<GestaoTransacoes> mono = gestaoTransacoesService.getById(idTransacao);
        return mono;
    }

}
