package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service;

import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;


import java.util.concurrent.ExecutionException;

public interface GestaoTransacoesService {

    public void addTransacoes(GestaoTransacoes pGestaoTransacoes);

    public void  atualizarProtocoloFraudes(GestaoTransacoes pGestaoTransacoes);

    public void atualizarStatusFraudes(GestaoTransacoes pGestaoTransacoes);

    public GestaoTransacoes getById(String id);




}
