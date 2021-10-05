package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.controller;

import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service.GestaoTransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class GestaoTransacoesController {

    @Autowired
    GestaoTransacoesService gestaoTransacoesService;

    @PostMapping("/transacoes")
    public ResponseEntity<GestaoTransacoes> save(@RequestBody GestaoTransacoes gestaoTransacoes) {

        ResponseEntity responseEntity = null;
        try {
            this.gestaoTransacoesService.addTransacoes(gestaoTransacoes);
            responseEntity = new ResponseEntity(gestaoTransacoes, HttpStatus.CREATED);
        } catch (Exception pException) {
            throw pException;
        }
        return responseEntity;
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
    public ResponseEntity<GestaoTransacoes> getById(@PathVariable String idTransacao) {
        ResponseEntity<GestaoTransacoes> responseEntity;

        try {
            responseEntity = new ResponseEntity<>(this.gestaoTransacoesService.getById(idTransacao), HttpStatus.OK);
        } catch (Exception pException) {
            throw  pException;
        }
        return responseEntity;
    }

}
