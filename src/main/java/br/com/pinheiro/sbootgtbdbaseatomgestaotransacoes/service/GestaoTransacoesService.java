package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service;

import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;


import java.util.concurrent.ExecutionException;

public interface GestaoTransacoesService {

    public void addTransacoes(GestaoTransacoes pGestaoTransacoes);

    public String atualizarProtocoloFraudes(String id, GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException;

    public String atualizarStatusFraudes(String id, GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException;

    public GestaoTransacoes getById(String id);




}
