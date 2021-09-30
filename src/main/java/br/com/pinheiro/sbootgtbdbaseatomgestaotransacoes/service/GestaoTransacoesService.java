package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service;

import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

public interface GestaoTransacoesService {

    public Mono<GestaoTransacoes> addTransacoes(GestaoTransacoes pGestaoTransacoes);

    public String atualizarProtocoloFraudes(String id, GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException;

    public String atualizarStatusFraudes(String id, GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException;


    public Flux<GestaoTransacoes> get();

    public Mono<GestaoTransacoes> getById(String id);

    public Flux<GestaoTransacoes> getByWebsite(String website);


}
